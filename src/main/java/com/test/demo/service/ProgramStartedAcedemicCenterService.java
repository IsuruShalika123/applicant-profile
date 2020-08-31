package com.test.demo.service;

import com.test.demo.Entity.ProgramStartedAcedemicCenter;
import com.test.demo.repo.ProgramStartedAcedemicCenterRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramStartedAcedemicCenterService {

    private ProgramStartedAcedemicCenterRepo programStartedAcedemicCenterRepo;

    public ProgramStartedAcedemicCenterService(ProgramStartedAcedemicCenterRepo programStartedAcedemicCenterRepo) {
        this.programStartedAcedemicCenterRepo = programStartedAcedemicCenterRepo;
    }

    public ProgramStartedAcedemicCenter create(ProgramStartedAcedemicCenter programStartedAcedemicCenter){
        return programStartedAcedemicCenterRepo.save(programStartedAcedemicCenter);
    }

    public List<ProgramStartedAcedemicCenter> get(){
        return programStartedAcedemicCenterRepo.findAll();
    }

    public List<ProgramStartedAcedemicCenter> getByProgramStartedId(Long programStartedId){
        return programStartedAcedemicCenterRepo.getProgramStartedAcedemicCentersByProgramstarted_Programstartedid(programStartedId);
    }
}
