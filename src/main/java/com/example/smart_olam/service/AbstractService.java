package com.example.smart_olam.service;

import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractService<R extends JpaRepository>{
    protected R repository;
    protected ObjectMapper mapper = new ObjectMapper();
    protected ModelMapper modelMapper = new ModelMapper();
    protected AbstractService(R repository) {
        this.repository = repository;
    }
}