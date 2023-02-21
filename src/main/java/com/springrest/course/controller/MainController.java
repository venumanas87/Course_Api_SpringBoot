package com.springrest.course.controller;

import com.springrest.course.dao.Course;
import com.springrest.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    CourseService service;

    @GetMapping("/home")
    public String home(){
        return "Welcome to homepage";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return service.getCourses();
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody  Course course){
        return service.addCourse(course);
    }

}
