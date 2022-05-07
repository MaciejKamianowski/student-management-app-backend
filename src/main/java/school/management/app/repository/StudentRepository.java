package school.management.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import school.management.app.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
