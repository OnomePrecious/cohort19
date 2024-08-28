package org.example.services;

import org.example.data.repositories.UserRepository;
import org.example.dtos.request.RegisterRequest;
import org.example.dtos.response.RegisterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @Test
    void register() {
        RegisterRequest request = new RegisterRequest();
        request.setUsername("Onome Precious");
        request.setPassword("1234");

        RegisterResponse response = userService.register(request);
        assertNotNull(response);
        assertThat(response.getMessage()).isEqualTo("Registration successful");
        assertEquals(1, userRepository.count());

    }
}