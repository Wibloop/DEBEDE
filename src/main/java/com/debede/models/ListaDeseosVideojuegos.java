package com.debede.models;

public class ListaDeseosVideojuegos {
    private int idListaDeseos;
    private int idVideojuego;

    // Constructor vacío
    public ListaDeseosVideojuegos() {
    }

    // Constructor con todos los atributos
    public ListaDeseosVideojuegos(int idListaDeseos, int idVideojuego) {
        this.idListaDeseos = idListaDeseos;
        this.idVideojuego = idVideojuego;
    }

    // Getters y Setters
    public int getIdListaDeseos() {
        return idListaDeseos;
    }

    public void setIdListaDeseos(int idListaDeseos) {
        this.idListaDeseos = idListaDeseos;
    }

    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }
}