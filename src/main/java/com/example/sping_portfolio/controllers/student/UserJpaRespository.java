package com.example.sping_portfolio.controllers.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserJpaRespository extends JpaRepository<User, Long> {
    User findByName(String name);
    List<User> findAllBy();
}
