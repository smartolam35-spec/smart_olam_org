package com.example.smart.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.smart.dto.courseImage.CourseImageResponse;
import com.example.smart.dto.courses.CoursesCreate;
import com.example.smart.dto.courses.CoursesResponse;
import com.example.smart.dto.courses.CoursesUpdate;
import com.example.smart.model.Course;
import com.example.smart.model.Image;

@Mapper(componentModel = "spring",uses = ModulMapper.class,nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CourseMapper extends BaseMapper<
         Course,
         CoursesResponse,
         CoursesCreate,
         CoursesUpdate> {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "url", target = "url")
    CourseImageResponse imageToCourseImageResponse(Image image); 
    
    @Mapping(source = "images", target = "images")
    CoursesResponse toDto(Course course);
}
