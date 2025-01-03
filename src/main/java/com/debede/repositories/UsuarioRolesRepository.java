package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.UsuarioRoles;

@Repository
public interface UsuarioRolesRepository extends JpaRepository<UsuarioRoles, Integer> {
}
