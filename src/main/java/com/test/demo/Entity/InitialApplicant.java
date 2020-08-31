package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "INITIAL_APPLICANT")
public class InitialApplicant {
    @Id
    private long id;
    private long programstartedid;
    private long streamid;
    private long specializationid;

    private long academiccenterid;
    private long admincenterid;
    private long med_mediumId;

    private long programentryqualificationid;
    private String nic;
    private String correspondanceaddress;

    private String namewithinitials;
    private String mobileno;
    private String faxno;

    private String email;
    private String mobileverifieid;
    private String emailverifiedid;
    private long applicantype_id;
}
