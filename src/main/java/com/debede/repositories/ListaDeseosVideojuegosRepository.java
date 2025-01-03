package com.debede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debede.models.ListaDeseosVideojuegos;

@Repository
public interface ListaDeseosVideojuegosRepository extends JpaRepository<ListaDeseosVideojuegos, Integer> {
}
