package com.example.jwt4.service;

import com.example.jwt4.dao.RoleDao;
import com.example.jwt4.entity.Role;
import com.example.jwt4.dao.RoleDao;
import com.example.jwt4.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;
    public Role createNewRole(Role role){
       return roleDao.save(role);
    }
}
