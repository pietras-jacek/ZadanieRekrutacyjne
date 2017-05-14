package com.rekrutacja.netpc.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rekrutacja.netpc.account.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
