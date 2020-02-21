package com.java.world.objectrelationsinjpa.mapper;

import com.java.world.objectrelationsinjpa.entity.UserEntity;
import com.java.world.objectrelationsinjpa.model.User;
import com.java.world.objectrelationsinjpa.request.UserForm;
import com.java.world.objectrelationsinjpa.response.UserResource;

public interface UserMapper {

    User mapEntityToModel(UserEntity userEntity);
    UserEntity mapModelToEntity(User user);
    User mapFormToModel(UserForm userForm);
    UserResource mapModelToResource(User user);
}
