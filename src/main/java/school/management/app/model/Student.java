package school.management.app.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "students")
public class Student {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Integer age;
    private String teacherName;
}
