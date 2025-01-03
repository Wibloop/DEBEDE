package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
}
