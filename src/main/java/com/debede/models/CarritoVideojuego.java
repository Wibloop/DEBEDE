package com.debede.models;

public class CarritoVideojuego {
    private int idCarrito;
    private int idVideojuego;
    private int cantidad;

    // Constructor vacío
    public CarritoVideojuego() {
    }

    // Constructor con todos los atributos
    public CarritoVideojuego(int idCarrito, int idVideojuego, int cantidad) {
        this.idCarrito = idCarrito;
        this.idVideojuego = idVideojuego;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}