package com.java.world.objectrelationsinjpa.response;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class UserResource {

    private Long id;
    private String username;

    @JsonProperty(value = "address")
    private AddressResource addressResource;
}
