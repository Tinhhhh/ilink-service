package com.exe201.ilink_service.service;

import com.exe201.ilink_service.dto.request.RegistrationRequest;

public interface AuthenService {
    void register(RegistrationRequest request);
}
