package com.example.smart_olam.mapper;

import java.util.List;

import org.mapstruct.MappingTarget;


public interface BaseMapper<E, D, CD, UD> {
    D toDto(E entity);
    List<D> toDto(List<E> entity);
    E fromCreateDto(CD createEntity);
    void fromUpdateDto(UD ud, @MappingTarget E entity);
}