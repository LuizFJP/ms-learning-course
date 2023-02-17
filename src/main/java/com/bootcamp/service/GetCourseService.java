package com.bootcamp.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.data.CourseRepository;
import com.bootcamp.domain.Course;
import com.bootcamp.entity.CourseEntity;
import com.bootcamp.mappers.ListCourseEntityToListCourse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GetCourseService {
  @Autowired
  CourseRepository courseRepository;

  private final ListCourseEntityToListCourse listCourseEntityToListCourse;

  public List<Course> getCourse(String id) {
    List<CourseEntity> courseEntity; 

    if (idIsEmpty(id)) {
      courseEntity = getAllCourses();
    } else {
      UUID uuid = UUID.fromString(id);
      courseEntity = Arrays.asList(getCourseByID(uuid));
    }

    return listCourseEntityToListCourse.mapper(courseEntity);
  }

  public List<CourseEntity>getAllCourses() {
    return courseRepository.findAll();
  }

  public CourseEntity getCourseByID(UUID id) {
    return courseRepository.findCourseById(id);
  }

  private boolean idIsEmpty(String id) {
    return id == null || id == "";
  } 
}
