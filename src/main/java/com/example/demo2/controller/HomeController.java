package com.example.demo2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/principal", method = RequestMethod.GET)
    public String paginaPrincipal(){
        return "hola mundo";
    }
}

