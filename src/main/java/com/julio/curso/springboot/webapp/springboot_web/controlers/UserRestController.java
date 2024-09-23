package com.julio.curso.springboot.webapp.springboot_web.controlers;

import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.julio.curso.springboot.webapp.springboot_web.models.User;
import com.julio.curso.springboot.webapp.springboot_web.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @RequestMapping(path="/details", method = RequestMethod.GET)
    public UserDto details() {
        
        UserDto userDto= new UserDto();
        User user = new User("Julio", "Herrera");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring boot");

        return userDto;
    }

    @RequestMapping(path="/list", method = RequestMethod.GET)
    public List<User> list(){
        User user = new User("Julio", "Herrera");
        User user2 = new User("Vanessa", "Ruiz");
        User user3 = new User("Francisco", "Herrera");


        List<User> users = Arrays.asList(user,user2,user3);

        //List<User> users = new ArrayList<>();

        //users.add(user);
        //users.add(user2);
        //users.add(user3);

        return users;
    };
    
    @RequestMapping(path="/details-map", method = RequestMethod.GET)
    public Map<String, Object> detailsMap() {
        
        User user = new User("Julio", "Herrera");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo Spring boot");
        body.put("user", user);
        
        return body;
    }
    
}
 