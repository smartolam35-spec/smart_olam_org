package com.example.smart_olam.model;


import java.util.Date;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditEntity extends Auditable {

    @LastModifiedDate
    @UpdateTimestamp
    @Column(columnDefinition = "timestamp default now()")
    @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm:ss")
    private Date updateAt = new Date();

    @CreatedBy
    @Column
    private Long createBy;

    @Column(columnDefinition = "bool default false")
    private boolean deleted = false;

}
