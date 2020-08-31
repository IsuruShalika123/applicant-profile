package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@Entity(name = "RGM_PROGRAM_SPECIALIZATION")
public class RgmProgramSpecialization {
    @Id
    private long programspecilizationid;
    @ManyToOne
    private Program program;
    @ManyToOne
    private Specialization specilization;
}
