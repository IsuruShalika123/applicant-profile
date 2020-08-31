package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "FIRST_LOGIN_USER")
public class FirstLoginUser {
  @Id
  Long id;
  String password;
  String username;
  String role_id;

}
