package com.example.smart.dto.courses;


import com.example.smart.dto.GenericDto;
import com.example.smart.dto.courseImage.CourseImageResponse;
import com.example.smart.dto.partner.PartnerResponse;

public class CoursesResponse extends GenericDto {
    public String courseName;
    public String status;
    public int moduleCount;
    public int duration; 
    // public List<CourseImageResponse> images;
    public CourseImageResponse images;
    public PartnerResponse partner;
    // public List<ModuleRespone> moduls;
}
