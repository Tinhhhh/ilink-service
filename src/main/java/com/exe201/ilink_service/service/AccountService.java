package com.exe201.ilink_service.service;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;

public interface AccountService {
    ResponseEntity<Object> getAccountInformation(HttpServletRequest request);
}
