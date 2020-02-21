package com.java.world.objectrelationsinjpa.gateway.impl;

import com.java.world.objectrelationsinjpa.entity.AddressEntity;
import com.java.world.objectrelationsinjpa.entity.UserEntity;
import com.java.world.objectrelationsinjpa.gateway.UserGateway;
import com.java.world.objectrelationsinjpa.mapper.AddressMapper;
import com.java.world.objectrelationsinjpa.mapper.UserMapper;
import com.java.world.objectrelationsinjpa.model.User;
import com.java.world.objectrelationsinjpa.repository.AddressRepository;
import com.java.world.objectrelationsinjpa.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class IUserGateway implements UserGateway {

    private final UserRepository userRepository;
    private final AddressRepository addressRepository;
    private final UserMapper userMapper;
    private final AddressMapper addressMapper;

    @Override
    public void createUser(User user) {
        UserEntity userEntity = userMapper.mapModelToEntity(user);
        AddressEntity addressEntity = addressMapper.mapToEntity(user.getAddress());

        userEntity.setAddress(addressEntity);

        addressEntity.setUser(userEntity);

        userRepository.save(userEntity);
        addressRepository.save(addressEntity);
    }

    @Override
    public List<User> getUsers() {

        return userRepository.findAll()
                .stream()
                .map(userMapper::mapEntityToModel)
                .collect(Collectors.toList());
    }

    @Override
    public User findUserById(Long id) {
        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No user found."));

        return userMapper.mapEntityToModel(user);
    }
}
