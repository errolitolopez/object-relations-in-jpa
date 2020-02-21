package com.java.world.objectrelationsinjpa.mapper.impl;

import com.java.world.objectrelationsinjpa.entity.AddressEntity;
import com.java.world.objectrelationsinjpa.mapper.AddressMapper;
import com.java.world.objectrelationsinjpa.model.Address;
import org.springframework.stereotype.Service;

@Service
public class IAddressMapper implements AddressMapper {
    @Override
    public Address mapToModel(AddressEntity addressEntity) {

        Address address = new Address();
        address.setId(addressEntity.getId());
        address.setStreet(addressEntity.getStreet());
        address.setCity(addressEntity.getCity());
        return address;
    }

    @Override
    public AddressEntity mapToEntity(Address address) {

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setId(address.getId());
        addressEntity.setStreet(address.getStreet());
        addressEntity.setCity(address.getCity());
        return addressEntity;
    }
}
