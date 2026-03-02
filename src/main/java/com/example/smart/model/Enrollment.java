package com.example.smart.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment extends AuditEntity {

    @ManyToOne
    private User user;

    @ManyToOne
    private Course course;

    private boolean active;

    private LocalDateTime purchasedAt;
}