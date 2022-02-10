package com.example.sping_portfolio.controllers.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserSqlRespository {
    @Autowired
    UserJpaRespository graceJPA;

    public List<User> listAll() {return graceJPA.findAll();
        }
    }

