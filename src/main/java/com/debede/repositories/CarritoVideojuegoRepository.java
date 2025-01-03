package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.CarritoVideojuego;

@Repository
public interface CarritoVideojuegoRepository extends JpaRepository<CarritoVideojuego, Integer> {
}
