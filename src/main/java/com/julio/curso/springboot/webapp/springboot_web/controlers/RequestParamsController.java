package com.julio.curso.springboot.webapp.springboot_web.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julio.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.julio.curso.springboot.webapp.springboot_web.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
    
    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code){
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }
    
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request){
        ParamMixDto params = new ParamMixDto();
        params.setCode(Integer.parseInt(request.getParameter("code")));
        params.setMessage(request.getParameter("message"));
        return params;
    }
    

}
