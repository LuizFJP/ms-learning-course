package com.bootcamp.controller;

import java.util.UUID;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.domain.Course;
import com.bootcamp.dto.CourseDTO;
import com.bootcamp.mappers.CourseDTOToCourse;
import com.bootcamp.service.CreateCourseService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class CreateCourseController {

  @Autowired
  CreateCourseService createCourseService;

  private final CourseDTOToCourse courseDTOToCourse;

  @PostMapping("/course")
  public ResponseEntity<UUID> create(@Valid @RequestBody CourseDTO courseDTO) {

    Course course = courseDTOToCourse.mapper(courseDTO);
    UUID courseId = createCourseService.create(course);

    return new ResponseEntity<UUID>(courseId, HttpStatus.CREATED);

  }
}
