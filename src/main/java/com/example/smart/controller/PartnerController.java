package com.example.smart.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smart.dto.partner.PartnerCreate;
import com.example.smart.dto.partner.PartnerResponse;
import com.example.smart.service.PartnerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/partner")
public class PartnerController {
    private final PartnerService service;

    @PreAuthorize("hasRole('SUPER_ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody PartnerCreate create) {
        PartnerResponse respone = service.create(create);
        return new ResponseEntity<>(respone,HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('SUPER_ADMIN')")
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<PartnerResponse> responses = service.getAll();
        return new ResponseEntity<>(responses,HttpStatus.OK);
    }

}
