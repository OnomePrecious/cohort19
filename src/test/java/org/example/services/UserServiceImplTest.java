package org.example.services;

import org.example.data.repositories.UserRepository;
import org.example.dtos.request.LoginRequest;
import org.example.dtos.request.RegisterRequest;
import org.example.dtos.response.LoginResponse;
import org.example.dtos.response.RegisterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
}