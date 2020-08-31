package com.test.demo.controller;

import com.test.demo.Entity.Test;
import com.test.demo.Entity.Test2;
import com.test.demo.service.TestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping(path = "/test/create")
    public Test createTest(@RequestBody Test test){
        return testService.createTest(test);
    }

    @PostMapping(path = "/test2/create")
    public Test2 createTest2(@RequestBody Test2 test2){
        return testService.createTest2(test2);
    }
    @GetMapping(path = "/get/test2")
    public List<Test2> getTest2(){
        return testService.getTest2();
    }
}
