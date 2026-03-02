package com.example.smart.model;

import java.util.List;

import com.example.smart.enums.Status;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Partner extends AuditEntity {
    private String partnerName;
    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;
    @OneToMany(mappedBy = "partner",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Course> courses;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
