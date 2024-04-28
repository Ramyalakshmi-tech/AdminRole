package com.example.jwt4.dao;

import com.example.jwt4.entity.User;
import com.example.jwt4.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,String> {
}
