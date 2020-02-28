package com.java.world.objectrelationsinjpa.service;

import com.java.world.objectrelationsinjpa.request.AccountForm;
import com.java.world.objectrelationsinjpa.response.AccountResource;

public interface AccountService {

    void createAccounts(AccountForm accountForm);

    AccountResource findAccountByAccountNumber(String accountNumber);
}
