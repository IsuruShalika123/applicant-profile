package com.test.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "Program")
public class Program {
    @Id
    private long programid;
    //private String code;
    private String title;
    //private long FacultyId_FK;
    //private long departmentId_FK;
    //private long StudyModeId_FK;
    //private long noOflevels;
    //private long totalMinimumCredit;
    //private long ProgramOfstudyId_FK;
    //private long duration;
    //private Date introduceYear;
    //private Date startOfacademicYear;
    //private boolean hasDepartmentFacultyApproval;
    //private String hasGraduationRequest;
    private boolean isdisciplineapplicable;
    //private long installmentRate;
    //private Date elegibilityValidityPeriod;
    //private String DefultLevel;
    //private boolean isExitPoint;
    //private boolean isFlatRateForNewRegistration;
    //private long flatRateForNewRegistartion;
    //private boolean isFlatRateForReRegistration;
    //private long flatRateForReRegistartion;
    //private long lateFee;
    //private long PararelProgramId;//FK for it self
    //private boolean isSpecilizationApplicable;
    //private long validityPeriod;
    //private long ExemptedMarks;
    //private long ExemptedGradeId_FK;
    //private boolean isdefineRateForReRegirstration;
    //private long defineRateForReRegirstration;
    private boolean haslocalstudent;
    private boolean hasforiegnstudent;
    private boolean hasbothstudents;
    //private long OfferedBy_FK;
    //private long OuslUnitId_FK;
    //private boolean isStreamApplicable;
    //private boolean isNoneapplicable;
    //private long DeliveryModeId_FK;
    //private long AcademicYearID_FK;
    //private boolean hasEntryExam;
    //private boolean HasCounselling;
    //private long CounsellingMethodId_FK;
    //private long CounsellingRecListId_FK;

}
