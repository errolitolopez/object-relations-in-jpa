package com.java.world.objectrelationsinjpa.controller;

import com.java.world.objectrelationsinjpa.request.AccountForm;
import com.java.world.objectrelationsinjpa.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public void createAccounts(@RequestBody AccountForm accountForm) {

        accountService.createAccounts(accountForm);
    }
}
