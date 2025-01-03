package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.ListaDeseos;

@Repository
public interface ListaDeseosRepository extends JpaRepository<ListaDeseos, Integer> {
}
