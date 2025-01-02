package com.debede.models;

public class Ranking {
    private int idRanking;
    private int idVideojuego;
    private int puntuacion;
    private int posicion;

    // Constructor vacío
    public Ranking() {
    }

    // Constructor con todos los atributos
    public Ranking(int idRanking, int idVideojuego, int puntuacion, int posicion) {
        this.idRanking = idRanking;
        this.idVideojuego = idVideojuego;
        this.puntuacion = puntuacion;
        this.posicion = posicion;
    }

    // Getters y Setters
    public int getIdRanking() {
        return idRanking;
    }

    public void setIdRanking(int idRanking) {
        this.idRanking = idRanking;
    }

    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
