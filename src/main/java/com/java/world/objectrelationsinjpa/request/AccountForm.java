package com.java.world.objectrelationsinjpa.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AccountForm {

    @JsonProperty(value = "user_id")
    private Long userId;

    @JsonProperty(value = "account_numbers")
    private List<String> accountNumbers;
}
