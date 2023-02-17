package com.bootcamp.exception;

public class CourseAlreadyExistsException extends RuntimeException{
  public CourseAlreadyExistsException() {
    super("Course already exists.");
  }
} 
