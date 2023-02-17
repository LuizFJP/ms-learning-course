package com.bootcamp.mappers;

import org.springframework.stereotype.Component;

import com.bootcamp.domain.Course;
import com.bootcamp.entity.CourseEntity;

@Component
public class CourseEntityToCourse {
  public Course mapper(CourseEntity courseEntity) {
    var course = new Course();
    course.setCourseId(courseEntity.getId());
    course.setCourseName(courseEntity.getCourseName());
    course.setStatus(courseEntity.isStatus());
    course.setCreatedOn(courseEntity.getCreatedOn());
    return course;
  }
}
