package com.rekrutacja.netpc.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rekrutacja.netpc.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
