package com.example.AntiFraudSystem.repository;

import com.example.AntiFraudSystem.entity.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

    Role findByCode(String code);
}
