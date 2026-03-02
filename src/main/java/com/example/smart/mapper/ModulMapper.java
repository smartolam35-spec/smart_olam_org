package com.example.smart.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.smart.dto.modul.ModuleCreate;
import com.example.smart.dto.modul.ModulePubRespone;
import com.example.smart.dto.modul.ModuleRespone;
import com.example.smart.dto.modul.ModuleUpdate;
import com.example.smart.model.Modul;

@Mapper(componentModel = "spring",uses = LessonMapper.class,nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ModulMapper extends BaseMapper<
    Modul,
    ModuleRespone,
    ModuleCreate,
    ModuleUpdate 
>{
    @Mapping(source = "course.id", target = "courseId")
    ModuleRespone toDto(Modul modul);

    List<ModulePubRespone> toPubDto(List<Modul> modul);
}
