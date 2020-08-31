package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@Entity(name = "PROGRAMSTRATEDACEDEMICCENTER")
public class ProgramStartedAcedemicCenter {
    @Id
    private long programstartedacademiccenterid;
    @ManyToOne
    private ProgramStarted programstarted;
    @ManyToOne
    private RgmCenter cnt_center;
}
