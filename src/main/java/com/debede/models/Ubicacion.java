package com.debede.models;

public class Ubicacion {
    private int idUbicacion;
    private String nombreUbicacion;
    private String direccion;

    // Constructor vacío
    public Ubicacion() {
    }

    // Constructor con todos los atributos
    public Ubicacion(int idUbicacion, String nombreUbicacion, String direccion) {
        this.idUbicacion = idUbicacion;
        this.nombreUbicacion = nombreUbicacion;
        this.direccion = direccion;
    }

    // Getters y Setters
    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
