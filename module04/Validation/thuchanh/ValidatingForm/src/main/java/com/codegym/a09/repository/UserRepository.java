package com.codegym.a09.repository;

import com.codegym.a09.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User ,Integer> {
}
