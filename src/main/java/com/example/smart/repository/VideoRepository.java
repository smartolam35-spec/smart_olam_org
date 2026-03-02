package com.example.smart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smart.model.Video;

public interface VideoRepository extends JpaRepository<Video,Long> {
    List<Video> findAllByLesson_Id(Long id);
}

