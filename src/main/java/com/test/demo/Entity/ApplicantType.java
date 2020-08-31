package com.test.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "APPLICANT_TYPE")
public class ApplicantType {
    @Id
    Long id;
    String description;
}
