package com.aigleinfo.siksepounoutout.rest.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/option")
@Api
public class OptionController {
  @RequestMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }
}
