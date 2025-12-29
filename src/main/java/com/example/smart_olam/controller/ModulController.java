package com.example.smart_olam.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smart_olam.dto.modul.ModuleCreate;
import com.example.smart_olam.dto.modul.ModuleRespone;
import com.example.smart_olam.service.ModulService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/modul")
public class ModulController {

    public final ModulService service;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ModuleCreate create) {
        ModuleRespone respone = service.create(create);
        return new ResponseEntity<>(respone,HttpStatus.CREATED);
    }

    @GetMapping("/getAll/{courseId}")
    public ResponseEntity<List<ModuleRespone>> getAll(@PathVariable("courseId") Long courseId){
        List<ModuleRespone> response = service.getAllByCourseId(courseId);
        return ResponseEntity.ok(response);
    }
}
