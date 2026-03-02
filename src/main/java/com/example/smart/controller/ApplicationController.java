package com.example.smart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smart.dto.application.ApplicationCreate;
import com.example.smart.dto.application.ApplicationResponse;
import com.example.smart.service.ApplicationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/applications")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService service;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ApplicationCreate create) {
        ApplicationResponse respone = service.create(create);
        return new ResponseEntity<>(respone,HttpStatus.CREATED);
    }

}
