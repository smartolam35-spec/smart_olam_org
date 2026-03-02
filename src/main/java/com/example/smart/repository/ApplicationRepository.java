package com.example.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smart.model.Application;

public interface ApplicationRepository extends  JpaRepository<Application,Long>{
    
}
