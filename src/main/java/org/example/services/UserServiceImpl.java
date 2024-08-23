package org.example.services;

import org.example.dtos.request.RegisterRequest;
import org.example.dtos.response.RegisterResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public RegisterResponse register(RegisterRequest request) {
        return null;
    }
}
