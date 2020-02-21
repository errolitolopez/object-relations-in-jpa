package com.java.world.objectrelationsinjpa.mapper.impl;

import com.java.world.objectrelationsinjpa.entity.UserEntity;
import com.java.world.objectrelationsinjpa.mapper.UserMapper;
import com.java.world.objectrelationsinjpa.model.Address;
import com.java.world.objectrelationsinjpa.model.User;
import com.java.world.objectrelationsinjpa.request.UserForm;
import com.java.world.objectrelationsinjpa.response.AddressResource;
import com.java.world.objectrelationsinjpa.response.UserResource;
import org.springframework.stereotype.Service;

@Service
public class IUserMapper implements UserMapper {

    @Override
    public User mapEntityToModel(UserEntity userEntity) {
        User user = new User();
        user.setId(userEntity.getId());
        user.setUsername(userEntity.getUsername());

        Address address = new Address();
        address.setId(userEntity.getAddress().getId());
        address.setStreet(userEntity.getAddress().getStreet());
        address.setCity(userEntity.getAddress().getCity());

        user.setAddress(address);
        return user;
    }

    @Override
    public UserEntity mapModelToEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setUsername(user.getUsername());
        return userEntity;
    }

    @Override
    public User mapFormToModel(UserForm userForm) {
        User user = new User();
        user.setUsername(userForm.getUsername());

        Address address = new Address();
        address.setStreet(userForm.getAddressForm().getStreet());
        address.setCity(userForm.getAddressForm().getCity());

        user.setAddress(address);

        return user;
    }

    @Override
    public UserResource mapModelToResource(User user) {
        UserResource userResource = new UserResource();
        userResource.setId(user.getId());
        userResource.setUsername(user.getUsername());

        AddressResource addressResource = new AddressResource();
        addressResource.setStreet(user.getAddress().getStreet());
        addressResource.setCity(user.getAddress().getCity());

        userResource.setAddressResource(addressResource);
        return userResource;
    }
}
