package com.example.todowebapps.controller;

import com.example.todowebapps.repository.toDoRepository;
import com.example.todowebapps.DTO.toDoForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class toDoController {

    private toDoRepository toDoRepository;

    @Autowired
    public toDoController(toDoRepository toDoRepository) {this.toDoRepository= toDoRepository; }

    @RequestMapping(path = "/")
    public ModelAndView goToHome() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("homePage");

        return mav;

    }

    @RequestMapping(path = "/addToDo", method = RequestMethod.POST)
    public ModelAndView addTodo(toDoForm addTaskForm) {
        ModelAndView mav = new ModelAndView();
        System.out.println("Test");
        System.out.println(addTaskForm.getTitle());
       // toDoRepository.addToDo(ToDoForm);


        System.out.println("Added Task");
        mav.setViewName("homePage");
        return  mav;
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
