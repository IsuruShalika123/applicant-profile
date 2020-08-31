package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity(name = "TEST2")
public class Test2 {
    @Id
    Long id;
    String name;
    @OneToOne
    Test testObj;
}
