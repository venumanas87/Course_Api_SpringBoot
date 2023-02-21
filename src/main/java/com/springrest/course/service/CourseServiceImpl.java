package com.springrest.course.service;

import com.springrest.course.dao.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;
    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(100L,"course1","this is the description fro course 1"));
        list.add(new Course(200L,"course2","this is the description fro course 2"));
        list.add(new Course(300L,"course1","this is the description fro course 1"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
