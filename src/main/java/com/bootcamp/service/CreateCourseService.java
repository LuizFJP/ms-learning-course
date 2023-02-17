package com.bootcamp.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.data.CourseRepository;
import com.bootcamp.domain.Course;
import com.bootcamp.entity.CourseEntity;
import com.bootcamp.exception.CourseAlreadyExistsException;
import com.bootcamp.mappers.CourseToCourseEntity;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CreateCourseService {

  @Autowired
  CourseRepository courseRepository;

  private final CourseToCourseEntity courseToCourseEntity;

  public UUID create(Course course) {

    courseAlreadyExists(course.getCourseName());

    var courseEntity = courseToCourseEntity.mapper(course);
    courseRepository.save(courseEntity);
    return courseEntity.getId();

  }

  private void courseAlreadyExists(String courseName) throws CourseAlreadyExistsException {
    CourseEntity course = courseRepository.findByCourseName(courseName);
    if (course != null)
      throw new CourseAlreadyExistsException();
  }
}
