//package com.test.demo.controller;
//
//import com.test.demo.Entity.PostalCode;
//import com.test.demo.service.PostalCodeService;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class PostalCodeController {
//
//    private PostalCodeService postalCodeService;
//
//    public PostalCodeController(PostalCodeService postalCodeService) {
//        this.postalCodeService = postalCodeService;
//    }
//
//    @PostMapping(path = "/postal-code/create")
//    public PostalCode create(@RequestBody PostalCode postalCode){
//        return postalCodeService.create(postalCode);
//    }
//
//    @GetMapping(path = "/postal-code/get/{cityName}")
//    public PostalCode get(@PathVariable("cityName") String cityName){
//        return postalCodeService.get(cityName);
//    }
//}
