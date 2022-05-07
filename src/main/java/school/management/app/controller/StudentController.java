package school.management.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.management.app.model.Student;
import school.management.app.repository.StudentRepository;

import java.util.List;

@RestController
public class StudentController {
    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student) {
        studentRepository.insert(student);
    }



    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/getall")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable String id) {
        Student response = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found!"));
        return response;
    }
}
