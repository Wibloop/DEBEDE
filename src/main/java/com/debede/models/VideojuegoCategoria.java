package com.debede.models;

public class VideojuegoCategoria {
    private int idVideojuego;
    private int idCategoria;

    // Constructor vacío
    public VideojuegoCategoria() {
    }

    // Constructor con todos los atributos
    public VideojuegoCategoria(int idVideojuego, int idCategoria) {
        this.idVideojuego = idVideojuego;
        this.idCategoria = idCategoria;
    }

    // Getters y Setters
    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}