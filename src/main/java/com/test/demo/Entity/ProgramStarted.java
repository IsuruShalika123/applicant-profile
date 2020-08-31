package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Data
@Entity(name = "PROGRAM_STRATED")
public class ProgramStarted {
    @Id
    private long programstartedid;
    @ManyToOne
    private Program program;
    private String studenttypeid;
    private boolean multiplebatchapplicable;
    private long academicyearid;
    private long batchno;
    private String programschedulecode;
    private String fromdate;
    private String todate;
    private long localfee;
    private long foreignfee;
}
