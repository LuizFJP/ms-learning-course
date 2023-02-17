package com.bootcamp.mappers;

import org.springframework.stereotype.Component;

import com.bootcamp.domain.Course;
import com.bootcamp.entity.CourseEntity;

@Component
public class CourseToCourseEntity {
  public CourseEntity mapper(Course course) {
    var courseEntity = new CourseEntity(course.getCourseName());
    return courseEntity;
  }
}
