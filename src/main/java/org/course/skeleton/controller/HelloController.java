package org.course.skeleton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "")
public class HelloController {

    @GetMapping(value = "/hello/{name}")
    @ResponseBody
    public String helloByName(@PathVariable String name) {
        String name2 = name.concat("test");
        return "Hello " + name2;
    }
}
