package com.example.smart.dto.user;


import com.example.smart.dto.GenericDto;
import com.example.smart.enums.Role;


public class UserResponse extends GenericDto {
    public Long id;
    public String username;
    public Role role;
}