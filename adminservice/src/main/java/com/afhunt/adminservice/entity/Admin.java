package com.afhunt.adminservice.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="username", nullable=false, unique=true)
    private String username;

    @Column(name="password", nullable=false)
    private String password;

    @Column(name="email_address", nullable=true)
    private String emailAddress;

    @Column(name="status", nullable=false)
    private Character status;

    @Column(name="login_attempt", nullable=true)
    private Integer loginAttempt;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles = new ArrayList<>();

    public Admin(String username, String password, List<String> roles, Character status)
    {
        this.username = username;
        this.password = password;
        this.status = status;
        this.roles = roles;
    }
    public Admin(){};
}
