package com.java.world.objectrelationsinjpa.controller;

import com.java.world.objectrelationsinjpa.request.UserForm;
import com.java.world.objectrelationsinjpa.response.UserResource;
import com.java.world.objectrelationsinjpa.service.UserService;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/all")
    public List<UserResource> getUsers() {

        return userService.getUsers();
    }

    @PostMapping
    public void createUser(@Valid @RequestBody UserForm userForm) {

        userService.createUser(userForm);
    }
}
