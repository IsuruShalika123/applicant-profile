package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "SPECIALIZATION")
public class Specialization {
    @Id
    private long id;
    private String description;
    private String code;
    private long departmentid_fk;
}
