package com.example.smart_olam.dto.registerRequest;

import com.example.smart_olam.enums.Role;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private Role role;
}
