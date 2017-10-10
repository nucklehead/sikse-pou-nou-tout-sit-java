package com.aigleinfo.siksepounoutout.rest.controllers;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aigleinfo.siksepounoutout.repository.CommentRepository;

@RestController
@RequestMapping("/api/comment")
@Api
public class CommentController {
    @Autowired
    CommentRepository commentRepository;
  @RequestMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }
}
