package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {
}
