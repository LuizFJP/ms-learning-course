package com.bootcamp.data;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.bootcamp.entity.CourseEntity;

public interface CourseRepository extends MongoRepository<CourseEntity, UUID> {
  @Query(value = "{'courseName': ?0}")
  CourseEntity findByCourseName(String name);
  @Query(value = "{'courseId': ?0}")
  CourseEntity findCourseById(UUID id);
}
