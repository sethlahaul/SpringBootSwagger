package com.springboot.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootSwaggerController {
	
	@RequestMapping(value = "/hello")
    public String Hello() {
        return "Hello World";
    }
}
