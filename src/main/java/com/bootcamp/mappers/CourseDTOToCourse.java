package com.bootcamp.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.bootcamp.domain.Course;
import com.bootcamp.dto.CourseDTO;

@Component
public class CourseDTOToCourse {
  public Course mapper(CourseDTO courseDTO) {
    var course = new Course();
    BeanUtils.copyProperties(courseDTO, course);
    return course;
  }
}
