package com.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
