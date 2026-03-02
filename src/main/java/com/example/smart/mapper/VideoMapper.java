package com.example.smart.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.smart.dto.video.VideoCreate;
import com.example.smart.dto.video.VideoResponse;
import com.example.smart.dto.video.VideoUpdate;
import com.example.smart.model.Video;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface VideoMapper extends BaseMapper<
    Video,
    VideoResponse,
    VideoCreate,
    VideoUpdate 
> {

    @Mapping(source = "lesson.id", target = "lessonId")
    VideoResponse toDto(Video video);

    List<VideoResponse> toDto(List<Video> videos);
}