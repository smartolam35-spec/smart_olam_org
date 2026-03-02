package com.example.smart.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.smart.dto.application.ApplicationCreate;
import com.example.smart.dto.application.ApplicationResponse;
import com.example.smart.dto.application.ApplicationUpdate;
import com.example.smart.model.Application;

@Mapper(componentModel = "spring",uses = ModulMapper.class,nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ApplicationMapper extends BaseMapper<
    Application,
    ApplicationResponse,
    ApplicationCreate,
    ApplicationUpdate
> {

}
