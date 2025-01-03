package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.VideojuegoCategoria;

@Repository
public interface VideojuegoCategoriaRepository extends JpaRepository<VideojuegoCategoria, Integer> {
}
