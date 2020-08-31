//package com.test.demo.service;
//
//import com.test.demo.Entity.PostalCode;
//import com.test.demo.repo.PostalCodeRepo;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PostalCodeService {
//
//    private PostalCodeRepo postalCodeRepo;
//
//    public PostalCodeService(PostalCodeRepo postalCodeRepo) {
//        this.postalCodeRepo = postalCodeRepo;
//    }
//
//    public PostalCode create(PostalCode postalCode){
//        return postalCodeRepo.save(postalCode);
//    }
//
//    public PostalCode get(String cityName){
//        return postalCodeRepo.getPostalCodeByCity(cityName);
//    }
//}
