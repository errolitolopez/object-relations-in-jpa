package com.java.world.objectrelationsinjpa.gateway;

import com.java.world.objectrelationsinjpa.model.Account;
import java.util.List;

public interface AccountGateway {

    void createAccounts(Long id, List<Account> accounts);
}
