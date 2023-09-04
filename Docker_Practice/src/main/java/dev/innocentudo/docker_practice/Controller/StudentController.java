package dev.innocentudo.docker_practice.Controller;

import dev.innocentudo.docker_practice.Model.Student;
import dev.innocentudo.docker_practice.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Student Controller";
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
