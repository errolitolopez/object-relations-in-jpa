package com.java.world.objectrelationsinjpa.gateway;

import com.java.world.objectrelationsinjpa.model.User;
import java.util.List;

public interface UserGateway {

    void createUser(User user);

    List<User> getUsers();

    User findUserById(Long id);
}
