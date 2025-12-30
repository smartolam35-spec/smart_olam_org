package com.example.smart_olam.mapper;

import org.mapstruct.*;
import com.example.smart_olam.dto.modul.ModuleCreate;
import com.example.smart_olam.dto.modul.ModuleRespone;
import com.example.smart_olam.dto.modul.ModuleUpdate;
import com.example.smart_olam.model.Modul;

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface ModulMapper extends BaseMapper<
    Modul,
    ModuleRespone,
    ModuleCreate,
    ModuleUpdate 
>{
    
    @Override
    @Mapping(target = "courseId", source = "course.id")
    ModuleRespone toDto(Modul modul);
    
    // Hech qanday qo'shimcha metod kerak emas
}