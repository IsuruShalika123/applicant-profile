package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "RGP_MEDIUM")
public class RgpMedium {
    @Id
    private long med_mediumId;
    private String med_description;
}
