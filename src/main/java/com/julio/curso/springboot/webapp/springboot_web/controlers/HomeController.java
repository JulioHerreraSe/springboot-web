package com.julio.curso.springboot.webapp.springboot_web.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home(){
        return "forward:/details";
    }
    

}
