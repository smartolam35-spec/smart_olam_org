package com.example.smart_olam.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService<D,UD,CD,I extends Serializable> {

    D create(CD createDto);
    D update(UD updateDto);

    I delete(I id) ;

    D get(I id) ;

    List<D> getAll();

}
