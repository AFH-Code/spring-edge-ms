package com.afhunt.adminservice.repository;

import com.afhunt.adminservice.entity.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin,Long> {
}
