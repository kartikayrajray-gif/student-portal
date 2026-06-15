package com.example.studentportal;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class StudentController {

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        if(username.equals("admin") &&
           password.equals("1234")) {

            return "Login Successful";
        }

        return "Invalid Credentials";
    }

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student) {

        System.out.println("Roll No : " + student.getRollNo());
        System.out.println("Name : " + student.getName());
        System.out.println("Branch : " + student.getBranch());
        System.out.println("Semester : " + student.getSemester());

        return "Student Data Saved Successfully";
    }
}
