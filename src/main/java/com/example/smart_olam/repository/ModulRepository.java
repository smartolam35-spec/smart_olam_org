package com.example.smart_olam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smart_olam.model.Modul;

public interface ModulRepository extends JpaRepository<Modul,Long>{
    List<Modul> findAllByCourse_Id(Long courseId);
}
