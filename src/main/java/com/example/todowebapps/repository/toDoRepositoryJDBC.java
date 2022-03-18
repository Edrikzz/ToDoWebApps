package com.example.todowebapps.repository;

import com.example.todowebapps.DTO.toDoDTO;
import com.example.todowebapps.model.toDoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class toDoRepositoryJDBC implements toDoRepository{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public toDoRepositoryJDBC(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate; }


    @Override
    public List<toDoDTO> listToDo() {
        String sql = "SELECT * FROM things_to_do ";

        return jdbcTemplate.query(sql, new toDoMapper());

    }
}
