package com.aigleinfo.siksepounoutout.model;

import org.springframework.data.annotation.Id;

public class Account {
  @Id public String id;

  public String firstName;
  public String lastName;

  public Account() {}

  public Account(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
