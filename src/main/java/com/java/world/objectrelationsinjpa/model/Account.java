package com.java.world.objectrelationsinjpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long id;
    private String accountNumber;
    private User user;
}
