package dev.innocentudo.springbootmysqldocker.Controller;

import dev.innocentudo.springbootmysqldocker.Entities.Student;
import dev.innocentudo.springbootmysqldocker.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/findAll")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @PostMapping("/insert")
    public Student insertStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

}
