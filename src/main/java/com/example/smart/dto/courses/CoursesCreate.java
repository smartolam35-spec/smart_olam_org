package com.example.smart.dto.courses;

import com.example.smart.dto.BaseDto;
import com.example.smart.enums.Status;

public class CoursesCreate implements BaseDto {
    public String courseName;
    public Status status = Status.ACTIVE;
    public int moduleCount;
    public int duration;
    public Long partnerId;
}
