package com.aigleinfo.siksepounoutout.rest.controllers;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aigleinfo.siksepounoutout.repository.AccountRepository;

@RestController
@RequestMapping("/api/account")
@Api
public class AccountController {
    @Autowired
    AccountRepository accountRepository;
  
  @RequestMapping("/")
  public String get() {
    return "Greetings from Spring Boot!";
  }
}
