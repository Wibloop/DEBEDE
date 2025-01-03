package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.Permisos;

@Repository
public interface PermisosRepository extends JpaRepository<Permisos, Integer> {
}
