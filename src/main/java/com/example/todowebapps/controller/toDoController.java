package com.example.todowebapps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class toDoController {

    @RequestMapping
    public static void  addTodo() {
        System.out.println("Added Task");
    }
    @RequestMapping
    public static void deleteToDO(){
        System.out.println("Deleted Task ");
    }
}
