package com.test.demo.repo;

import com.test.demo.Entity.FirstLoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirstLoginUserRepo extends JpaRepository<FirstLoginUser, Long> {
}
