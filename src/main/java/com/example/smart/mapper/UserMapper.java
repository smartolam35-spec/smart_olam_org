package com.example.smart.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.smart.dto.registerRequest.RegisterRequest;
import com.example.smart.dto.user.UserResponse;
import com.example.smart.model.User;

@Mapper(componentModel = "spring",uses = LessonMapper.class,nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper{

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", constant = "USER")
    @Mapping(target = "application", ignore = true)
    @Mapping(target = "partner", ignore = true)
    User toEntity(RegisterRequest request);

    UserResponse toResponse(User user);
    List<UserResponse> toResponse(List<User> user);

}
