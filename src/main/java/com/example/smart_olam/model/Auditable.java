package com.example.smart_olam.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Auditable implements BaseEntity,Serializable {
    private static final long serialVersionUID = 7156526077883281623L;

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @Column(name = "created_at", columnDefinition = "TIMESTAMP default NOW()")
    @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm:ss")
    private Date createdAt = new Date();

}
