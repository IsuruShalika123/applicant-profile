package com.test.demo.service;

import com.test.demo.Entity.Test;
import com.test.demo.Entity.Test2;
import com.test.demo.repo.Test2Repo;
import com.test.demo.repo.TestRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private TestRepo testRepo;
    private Test2Repo test2Repo;

    public TestService(TestRepo testRepo, Test2Repo test2Repo) {
        this.testRepo = testRepo;
        this.test2Repo = test2Repo;
    }

    public Test createTest(Test test){
        return testRepo.save(test);
    }

    public Test2 createTest2(Test2 test2){
        return test2Repo.save(test2);
    }

    public List<Test2> getTest2(){
        return test2Repo.findAll();
    }
}
