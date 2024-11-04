package com.service.UserService.repositories;

import com.service.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}