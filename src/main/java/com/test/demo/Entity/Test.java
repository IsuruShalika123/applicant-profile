package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "TEST")
public class Test {
    @Id
    Long id;
    String name;
    String age;
}
