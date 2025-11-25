package br.com.api.tsagencia.tsagencia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Agency {
    @RequestMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "Word") String name) {
        return "Hello " + name;
    }
}