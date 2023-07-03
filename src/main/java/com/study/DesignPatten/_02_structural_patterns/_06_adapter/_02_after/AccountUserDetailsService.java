package com.study.DesignPatten._02_structural_patterns._06_adapter._02_after;

import com.study.DesignPatten._02_structural_patterns._06_adapter._02_after.Account;
import com.study.DesignPatten._02_structural_patterns._06_adapter._02_after.AccountService;
import com.study.DesignPatten._02_structural_patterns._06_adapter._02_after.security.UserDetails;
import com.study.DesignPatten._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
