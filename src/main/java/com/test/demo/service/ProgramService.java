package com.test.demo.service;

import com.test.demo.Entity.Program;
import com.test.demo.repo.ProgramRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {
    private ProgramRepo programRepo;

    public ProgramService(ProgramRepo programRepo) {
        this.programRepo = programRepo;
    }

    public Program createProgram(Program program){
        return programRepo.save(program);
    }

    public List<Program> get(){
        return programRepo.findAll();
    }
}
