package com.exe201.ilinkservice.service.Impl;

import com.exe201.ilinkservice.service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.exe201.ilinkservice.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class AccountServiceImplement implements AccountService {

    private final AccountRepository accountRepository;

    public ResponseEntity<Object> getAccountInformation(HttpServletRequest request) {
        return null;
    }
}
