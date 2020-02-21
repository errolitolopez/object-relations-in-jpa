package com.java.world.objectrelationsinjpa.mapper;


import com.java.world.objectrelationsinjpa.entity.AddressEntity;
import com.java.world.objectrelationsinjpa.model.Address;

public interface AddressMapper {

    Address mapToModel(AddressEntity addressEntity);

    AddressEntity mapToEntity(Address address);
}
