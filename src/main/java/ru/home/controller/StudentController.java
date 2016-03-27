package ru.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.home.model.Student;
import ru.home.repo.StudentRepo;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @RequestMapping("/student")
    public List<Student> findAll() {
        for(int i=0; i< 10; i++) {
            Student user = new Student();
            user.setFirstName("Maxim");
            studentRepo.save(user);
        }

        return studentRepo.findAll();
    }
}
