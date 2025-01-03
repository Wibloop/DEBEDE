package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Integer> {
}
