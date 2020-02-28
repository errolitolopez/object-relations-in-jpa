package com.java.world.objectrelationsinjpa.mapper;

import com.java.world.objectrelationsinjpa.entity.AccountEntity;
import com.java.world.objectrelationsinjpa.model.Account;
import com.java.world.objectrelationsinjpa.response.AccountResource;

public interface AccountMapper {

    Account mapEntityToModel(AccountEntity accountEntity);

    AccountEntity mapModelToEntity(Account account);

    AccountResource mapModelToResource(Account account);
}
