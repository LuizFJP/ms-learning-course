package com.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.domain.Course;
import com.bootcamp.service.GetCourseService;

@RestController
@RequestMapping("/api/v1")
public class GetCourseController {
  @Autowired
  GetCourseService getCourseService;

  @GetMapping(value = "/courses")
  public ResponseEntity<List<Course>> getCourseById(@RequestParam(value = "courseId", required = false) String id) {
    return ResponseEntity.ok(getCourseService.getCourse(id));
  }
}
