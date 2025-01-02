package com.debede.models;

public class ListaDeseos {
    private int idListaDeseos;
    private int idUsuario;

    // Constructor vacío
    public ListaDeseos() {
    }

    // Constructor con todos los atributos
    public ListaDeseos(int idListaDeseos, int idUsuario) {
        this.idListaDeseos = idListaDeseos;
        this.idUsuario = idUsuario;
    }

    // Getters y Setters
    public int getIdListaDeseos() {
        return idListaDeseos;
    }

    public void setIdListaDeseos(int idListaDeseos) {
        this.idListaDeseos = idListaDeseos;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}