package com.java.world.objectrelationsinjpa.service;

import com.java.world.objectrelationsinjpa.request.UserForm;
import com.java.world.objectrelationsinjpa.response.UserResource;
import java.util.List;

public interface UserService {

    void createUser(UserForm userForm);

    List<UserResource> getUsers();
}
