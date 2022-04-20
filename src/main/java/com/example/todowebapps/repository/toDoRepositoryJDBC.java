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
        String sql = "SELECT tTitle, tDesc FROM things_to_do ";
        return jdbcTemplate.query(sql, new toDoMapper());
    }

    @Override
    public List<toDoDTO> sortToDoTitle(){
        String sql = "SELECT tTitle, tDesc FROM things_to_do";
        return jdbcTemplate.query(sql, new toDoMapper());
    }

    @Override
    public List<toDoDTO> sortComplete() {
        String sql = "SELECT tTitle, tDesc FROM things_to_do WHERE tComplete = TRUE ";
        return jdbcTemplate.query(sql, new toDoMapper());
    }

    @Override
    public List<toDoDTO> sortUnComplete() {
        String sql = "SELECT tTitle, tDesc FROM things_to_do WHERE tComplete = FALSE";
        return jdbcTemplate.query(sql, new toDoMapper());
    }

}
