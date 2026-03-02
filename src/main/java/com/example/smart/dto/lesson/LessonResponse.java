package com.example.smart.dto.lesson;

import java.util.List;

import com.example.smart.dto.GenericDto;
import com.example.smart.dto.video.VideoResponse;

public class LessonResponse extends GenericDto {
    public String lessonName;
    public Long moduleId;
    public List<VideoResponse> videos;
}
