package com.test.demo.controller;

import com.test.demo.Entity.FirstLoginUser;
import com.test.demo.service.FirstLoginUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstLoginUserController {

    private FirstLoginUserService firstLoginUserService;

    public FirstLoginUserController(FirstLoginUserService firstLoginUserService) {
        this.firstLoginUserService = firstLoginUserService;
    }

    @PostMapping(path = "/first-login-user/create")
    public FirstLoginUser create(@RequestBody FirstLoginUser firstLoginUser){
        return firstLoginUserService.create(firstLoginUser);
    }

    @GetMapping(path = "/first-login-user/get")
    public List<FirstLoginUser> get(){
        return firstLoginUserService.get();
    }
}
