package com.debede.models;

public class Valoracion {
    private int idValoracion;
    private int idUsuario;
    private int idVideojuego;
    private double puntuacion;
    private String comentario;

    // Constructor vacío
    public Valoracion() {
    }

    // Constructor con todos los atributos
    public Valoracion(int idValoracion, int idUsuario, int idVideojuego, double puntuacion, String comentario) {
        this.idValoracion = idValoracion;
        this.idUsuario = idUsuario;
        this.idVideojuego = idVideojuego;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    // Getters y Setters
    public int getIdValoracion() {
        return idValoracion;
    }

    public void setIdValoracion(int idValoracion) {
        this.idValoracion = idValoracion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}