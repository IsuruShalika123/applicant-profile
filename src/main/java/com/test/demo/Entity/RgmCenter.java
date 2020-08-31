package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "RGM_CENTER")
public class RgmCenter {
    @Id
    private long cnt_centerId;
    private String cnt_code;
    private String cnt_description;
    private String ctp_centerTypeId;
    private String cnt_regionalCenterId;
    private String des_districtId;
    private String abbrivation;
    private String intergrationCode;
    private String emp_employeeCode_incharge;
}
