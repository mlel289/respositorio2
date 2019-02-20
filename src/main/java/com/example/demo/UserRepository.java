package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Transactional(readOnly=true)
    public String findAll() {
        return jdbcTemplate.queryForObject("select LastName from Persons where personId = 1",
                String.class);
    }
}
