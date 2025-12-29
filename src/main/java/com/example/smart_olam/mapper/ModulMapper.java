package com.example.smart_olam.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.smart_olam.dto.modul.ModuleCreate;
import com.example.smart_olam.dto.modul.ModuleRespone;
import com.example.smart_olam.dto.modul.ModuleUpdate;
import com.example.smart_olam.model.Modul;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ModulMapper extends BaseMapper<
    Modul,
    ModuleRespone,
    ModuleCreate,
    ModuleUpdate 
>{
    @Mapping(source = "course.id", target = "courseId")
    ModuleRespone toDto(Modul modul);
}
