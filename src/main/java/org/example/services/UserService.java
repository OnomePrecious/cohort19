package org.example.services;

import org.example.dtos.request.RegisterRequest;
import org.example.dtos.response.RegisterResponse;

public interface UserService {
    RegisterResponse register (RegisterRequest request);


}
package org.example.services;

import org.example.dtos.request.LoginRequest;
import org.example.dtos.request.RegisterRequest;
import org.example.dtos.response.LoginResponse;
import org.example.dtos.response.RegisterResponse;

public interface UserService {
    RegisterResponse register (RegisterRequest request);
    LoginResponse login (LoginRequest request);


}
