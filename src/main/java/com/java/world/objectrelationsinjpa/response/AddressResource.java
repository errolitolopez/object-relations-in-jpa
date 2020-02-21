package com.java.world.objectrelationsinjpa.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AddressResource {

    private String street;
    private String city;
}
