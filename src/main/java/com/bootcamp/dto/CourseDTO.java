package com.bootcamp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CourseDTO {

  @NotEmpty
  @Size(min = 4, message = "course name should have at least 4 characters")
  private String courseName;

  public CourseDTO() {
  }

  public String getCourseName() {
    return courseName;
  }
}
