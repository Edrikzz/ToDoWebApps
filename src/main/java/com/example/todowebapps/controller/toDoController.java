package com.example.todowebapps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class toDoController {

    @RequestMapping(path = "/addToDo")
    public static void  addTodo() {
        System.out.println("Added Task");
    }
    @RequestMapping(path = "/deleteToDo")
    public static void deleteToDO(){
        System.out.println("Deleted Task");
    }

    @RequestMapping(path = "/editToDo")
    public static void editToDo(){
        System.out.println("Edit Task");
    }

    @RequestMapping(path = "/completeToDo")
    public static void completeToDo() {
        System.out.println("Edit Task");
    }
}
