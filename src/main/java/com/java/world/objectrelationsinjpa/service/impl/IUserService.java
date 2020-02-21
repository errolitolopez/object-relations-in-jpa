package com.java.world.objectrelationsinjpa.service.impl;

import com.java.world.objectrelationsinjpa.gateway.UserGateway;
import com.java.world.objectrelationsinjpa.mapper.UserMapper;
import com.java.world.objectrelationsinjpa.model.User;
import com.java.world.objectrelationsinjpa.request.UserForm;
import com.java.world.objectrelationsinjpa.response.UserResource;
import com.java.world.objectrelationsinjpa.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class IUserService implements UserService {

    private final UserGateway userGateway;
    private final UserMapper userMapper;

    @Override
    public void createUser(UserForm userForm) {
        User user = userMapper.mapFormToModel(userForm);
        userGateway.createUser(user);
    }

    @Override
    public List<UserResource> getUsers() {

        return userGateway.getUsers()
                .stream()
                .map(userMapper::mapModelToResource)
                .collect(Collectors.toList());
    }
}
