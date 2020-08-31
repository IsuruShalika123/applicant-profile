package com.test.demo.repo;

import com.test.demo.Entity.ApplicantType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantTypeRepo extends JpaRepository<ApplicantType, Long> {
}
