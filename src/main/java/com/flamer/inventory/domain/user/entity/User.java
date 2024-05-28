package com.flamer.inventory.domain.user.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.lang.reflect.Type;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String username;

    private LocalDate birthday;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role = "USER_ROLE";
}
