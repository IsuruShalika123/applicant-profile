package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@Entity(name = "PROGRAM_STARTED_ACEDEMIC_CENTER_MEDIUM")
public class ProgramStartedAcedemicCenterMedium {
    @Id
    private long id;
    @ManyToOne
    private ProgramStartedAcedemicCenter programstartedacademiccenter;
    @ManyToOne
    private RgpMedium med_medium;
}
