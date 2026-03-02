package com.example.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smart.model.Partner;

public interface PartnerRepository extends JpaRepository<Partner,Long> {
    
}
