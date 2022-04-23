package com.example.todowebapps.repository;

import com.example.todowebapps.DTO.toDoDTO;
import com.example.todowebapps.model.toDoMapper;
import com.example.todowebapps.DTO.toDoForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class toDoRepositoryJDBC implements toDoRepository{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public toDoRepositoryJDBC(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate; }

    @Override
    public boolean addToDo(toDoForm addTaskForm) {
        int row = jdbcTemplate.update(
                "INSERT INTO things_to_do(tTitle,tComplete) values(?,false); ",
                new Object[]{
                        addTaskForm.getTitle()
                }
        );
        return row>0;
    }


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
