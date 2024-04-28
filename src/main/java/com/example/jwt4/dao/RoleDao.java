package com.example.jwt4.dao;

import com.example.jwt4.entity.Role;
import com.example.jwt4.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,String> {
}
