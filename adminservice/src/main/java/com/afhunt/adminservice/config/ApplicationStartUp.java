package com.afhunt.adminservice.config;

import com.afhunt.adminservice.entity.Admin;
import com.afhunt.adminservice.repository.AdminRepository;
import org.bouncycastle.crypto.generators.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.List;

@Component
public class ApplicationStartUp {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private StartupProperties startupProperties;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public CommandLineRunner loadData(){
        return (args) -> {
            Iterable<Admin> admins = adminRepository.findAll();

            if(ObjectUtils.isEmpty(admins)){
                Admin admin = new Admin(startupProperties.getUsername(),passwordEncoder.encode(startupProperties.getPassword()),Arrays.asList("ADMIN"),startupProperties.getStatus());
                this.adminRepository.save(admin);
            }
        };
    }
}
