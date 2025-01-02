package com.debede.models;

import java.util.Date;

public class Compra {
    private int idCompra;
    private int idUsuario;
    private Date fecha;
    private int total;

    // Constructor vacío
    public Compra() {
    }

    // Constructor con todos los atributos
    public Compra(int idCompra, int idUsuario, Date fecha, int total) {
        this.idCompra = idCompra;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.total = total;
    }

    // Getters y Setters
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}