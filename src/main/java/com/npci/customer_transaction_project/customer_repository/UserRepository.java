package com.npci.customer_transaction_project.customer_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.customer_transaction_project.customer_entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
