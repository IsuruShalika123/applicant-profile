package com.test.demo.service;

import com.test.demo.Entity.FirstLoginUser;
import com.test.demo.repo.FirstLoginUserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstLoginUserService {

    private FirstLoginUserRepo firstLoginUserRepo;

    public FirstLoginUserService(FirstLoginUserRepo firstLoginUserRepo) {
        this.firstLoginUserRepo = firstLoginUserRepo;
    }

    public FirstLoginUser create(FirstLoginUser firstLoginUser){
        return firstLoginUserRepo.save(firstLoginUser);
    }

    public List<FirstLoginUser> get(){
        return firstLoginUserRepo.findAll();
    }
}
