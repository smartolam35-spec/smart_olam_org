package com.example.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smart.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}

