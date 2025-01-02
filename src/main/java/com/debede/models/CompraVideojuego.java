package com.debede.models;

public class CompraVideojuego {
    private int idCompra;
    private int idVideojuego;
    private int cantidad;
    private double precioUnitario;

    // Constructor vacío
    public CompraVideojuego() {
    }

    // Constructor con todos los atributos
    public CompraVideojuego(int idCompra, int idVideojuego, int cantidad, double precioUnitario) {
        this.idCompra = idCompra;
        this.idVideojuego = idVideojuego;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Getters y Setters
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}