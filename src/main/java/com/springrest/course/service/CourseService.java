package com.springrest.course.service;

import com.springrest.course.dao.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course addCourse(Course course);
}
