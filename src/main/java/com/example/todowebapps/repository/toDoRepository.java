package com.example.todowebapps.repository;

import com.example.todowebapps.DTO.toDoForm;

public interface toDoRepository {
    public Object listToDo();
    public boolean addToDo(toDoForm addTaskForm);
    public Object sortToDoTitle();
    public Object sortComplete();
    public Object sortUnComplete();

}
