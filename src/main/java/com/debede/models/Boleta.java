package com.debede.models;

public class Boleta {
    private int idBoleta;
    private int idCompra;
    private String medioPago;

    // Constructor vacío
    public Boleta() {
    }

    // Constructor con todos los atributos
    public Boleta(int idBoleta, int idCompra, String medioPago) {
        this.idBoleta = idBoleta;
        this.idCompra = idCompra;
        this.medioPago = medioPago;
    }

    // Getters y Setters
    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
}