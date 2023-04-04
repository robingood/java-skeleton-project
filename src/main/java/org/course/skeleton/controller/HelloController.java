package org.course.skeleton.controller;

import org.course.skeleton.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "")
public class HelloController {

    private int myNumber = 0;

    @GetMapping(value = "/hello/{name}")
    @ResponseBody
    public String helloByName(@PathVariable String name) {
        String name2 = name.concat("-test");

        Book book = new Book("La scaldat", 20);
        String capitalName = book.getName().toUpperCase();


        myNumber = myNumber + 1;

        return "User " + name + " has read : " + book.getDescription();
/*
        if (myNumber == 1) {
            return "Hello " + name2 + " you have called this page " + myNumber + " time";
        }
        return "Hello " + name2 + " you have called this page " + myNumber + " times";*/
    }
}
