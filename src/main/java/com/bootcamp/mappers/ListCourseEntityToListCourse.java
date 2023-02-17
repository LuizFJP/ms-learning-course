package com.bootcamp.mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.bootcamp.domain.Course;
import com.bootcamp.entity.CourseEntity;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ListCourseEntityToListCourse {
  private final CourseEntityToCourse courseEntityToCourse;

  public List<Course> mapper(List<CourseEntity> courseEntities) {
    if (courseEntities.contains(null)) {
      return null;
    } else {
      List<Course> courses = new ArrayList<>();
      for (CourseEntity course : courseEntities) {
        courses.add(courseEntityToCourse.mapper(course));
      }
      return courses;
    }

  }
}
