package com.iskoalmighty.springdemo.model.user;

import com.iskoalmighty.springdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
