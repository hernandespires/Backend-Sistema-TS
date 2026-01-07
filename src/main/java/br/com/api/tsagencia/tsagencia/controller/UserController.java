package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.User;
import br.com.api.tsagencia.tsagencia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping(value = "/allUsers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping(value = "/getUser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserById(String id) {
        return service.getUserById(id);
    }

    @PostMapping(
            value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
    )
    public User login(User user) {
        return service.login(user);
    }
}