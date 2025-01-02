package com.debede.models;

public class Carrito {
    private int idCarrito;
    private int idUsuario;

    // Constructor vacío
    public Carrito() {
    }

    // Constructor con todos los atributos
    public Carrito(int idCarrito, int idUsuario) {
        this.idCarrito = idCarrito;
        this.idUsuario = idUsuario;
    }

    // Getters y Setters
    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}