package com.example.smart_olam.dto.modul;

import java.util.List;

import com.example.smart_olam.dto.GenericDto;

public class ModuleUpdate extends GenericDto {
   public String modulName;
   public String price; 
   public Long courseId;
   public List<String> lessons;
}
