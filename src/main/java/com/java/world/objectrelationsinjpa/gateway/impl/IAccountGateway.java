package com.java.world.objectrelationsinjpa.gateway.impl;

import com.java.world.objectrelationsinjpa.entity.AccountEntity;
import com.java.world.objectrelationsinjpa.gateway.AccountGateway;
import com.java.world.objectrelationsinjpa.gateway.UserGateway;
import com.java.world.objectrelationsinjpa.mapper.AccountMapper;
import com.java.world.objectrelationsinjpa.mapper.UserMapper;
import com.java.world.objectrelationsinjpa.model.Account;
import com.java.world.objectrelationsinjpa.repository.AccountRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@Slf4j
public class IAccountGateway implements AccountGateway {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public void createAccounts(Long id, List<Account> accounts) {
        List<AccountEntity> accounts_ = accounts.stream()
                .map(accountMapper::mapModelToEntity)
                .collect(Collectors.toList());
        try {

            accountRepository.saveAll(accounts_);

        } catch (RuntimeException e) {

            throw new RuntimeException("Account number already exists.");
        }
    }
}
