package com.debede.models;

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String correo;
    private String clave;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con todos los atributos
    public Usuario(int idUsuario, String nombreUsuario, String correo, String clave) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.clave = clave;
    }

    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}