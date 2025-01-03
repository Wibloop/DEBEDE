package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.Boleta;

@Repository
public interface BoletaRepository extends JpaRepository<Boleta, Integer> {
}