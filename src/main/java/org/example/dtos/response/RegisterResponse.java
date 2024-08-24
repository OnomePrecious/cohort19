package org.example.dtos.response;

import lombok.Getter;
import lombok.Setter;
import org.example.data.models.User;

@Getter
@Setter
public class RegisterResponse {
    private String message;
    private User user;
}
