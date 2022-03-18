package com.example.todowebapps.model;

import com.example.todowebapps.DTO.toDoDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class toDoMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new toDoDTO(
                rs.getInt("tID"),
                rs.getString("tTitle"),
                rs.getString("tDesc"),
                rs.getBoolean("tComplete")
        );
    }

}
