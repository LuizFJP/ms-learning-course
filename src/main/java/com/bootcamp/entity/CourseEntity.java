package com.bootcamp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

@Document("courses")
public class CourseEntity {
  @Id
  private String id;
  public void setId(String id) {
    this.id = id;
  }

  private UUID courseId;
  private String courseName;
  private boolean status;
  private LocalDateTime createdOn;

  public CourseEntity(){}

  public CourseEntity(String _courseName) {
    courseId = UUID.randomUUID();
    courseName = _courseName;
    status = true;
    createdOn = LocalDateTime.of(LocalDate.now(), LocalTime.now());
  }

  public UUID getId() {
    return courseId;
  }

  public String getCourseName() {
    return courseName;
  }

  public boolean isStatus() {
    return status;
  }

  public LocalDateTime getCreatedOn() {
    return createdOn;
  }

  public void setId(UUID courseId) {
    this.courseId = courseId;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public void setCreatedOn(LocalDateTime createdOn) {
    this.createdOn = createdOn;
  } 

  
}
