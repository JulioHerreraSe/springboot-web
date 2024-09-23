package com.julio.curso.springboot.webapp.springboot_web.controlers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.julio.curso.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
         User user = new User("Julio", "Herrera");
         user.setEmail("Julio.hs@jhs.com");
        model.addAttribute("title", "Hola mundo Spring boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("title", "Lista de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
            new User("pepa", "gonzalez"), 
            new User("lalo", "perez", "lalo@correo.com"), 
            new User("juan", "roe", "juana@correo.com"),
            new User("andres", "Doe"));
    }

}
