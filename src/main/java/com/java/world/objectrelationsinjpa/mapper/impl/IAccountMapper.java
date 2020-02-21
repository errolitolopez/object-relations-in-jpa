package com.java.world.objectrelationsinjpa.mapper.impl;

import com.java.world.objectrelationsinjpa.entity.AccountEntity;
import com.java.world.objectrelationsinjpa.entity.UserEntity;
import com.java.world.objectrelationsinjpa.mapper.AccountMapper;
import com.java.world.objectrelationsinjpa.model.Account;
import com.java.world.objectrelationsinjpa.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class IAccountMapper implements AccountMapper {

    @Override
    public Account mapEntityToModel(AccountEntity accountEntity) {

        Account account = new Account();
        account.setId(accountEntity.getId());
        account.setAccountNumber(accountEntity.getAccountNumber());

        User user = new User();
        user.setId(accountEntity.getUser().getId());
        user.setUsername(accountEntity.getUser().getUsername());

        account.setUser(user);

        return account;
    }

    @Override
    public AccountEntity mapModelToEntity(Account account) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setId(account.getId());
        accountEntity.setAccountNumber(account.getAccountNumber());

        UserEntity userEntity = new UserEntity();
        userEntity.setId(account.getUser().getId());
        userEntity.setUsername(account.getUser().getUsername());

        accountEntity.setUser(userEntity);

        return accountEntity;
    }

}
