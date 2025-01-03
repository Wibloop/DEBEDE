package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.RolPermisos;

@Repository
public interface RolPermisosRepository extends JpaRepository<RolPermisos, Integer> {
}
