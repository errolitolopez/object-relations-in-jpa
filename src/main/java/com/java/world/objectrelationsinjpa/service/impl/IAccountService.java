package com.java.world.objectrelationsinjpa.service.impl;

import com.java.world.objectrelationsinjpa.gateway.AccountGateway;
import com.java.world.objectrelationsinjpa.gateway.UserGateway;
import com.java.world.objectrelationsinjpa.mapper.AccountMapper;
import com.java.world.objectrelationsinjpa.model.Account;
import com.java.world.objectrelationsinjpa.model.User;
import com.java.world.objectrelationsinjpa.request.AccountForm;
import com.java.world.objectrelationsinjpa.response.AccountResource;
import com.java.world.objectrelationsinjpa.service.AccountService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class IAccountService implements AccountService {

    private final AccountGateway accountGateway;
    private final UserGateway userGateway;
    private final AccountMapper accountMapper;

    @Override
    public void createAccounts(AccountForm accountForm) {
        User user = userGateway.findUserById(accountForm.getUserId());

        List<Account> accounts = accountForm.getAccountNumbers()
                .stream()
                .map(accountNumber -> {

                    Account account = new Account();
                    account.setAccountNumber(accountNumber);

                    account.setUser(user);
                    return account;
                }).collect(Collectors.toList());

        accountGateway.createAccounts(accountForm.getUserId(), accounts);
    }

    @Override
    public AccountResource findAccountByAccountNumber(String accountNumber) {
        return accountMapper.mapModelToResource(
                accountGateway.findAccountByAccountNumber(accountNumber)
        );
    }
}
