package com.debede.models;

public class UsuarioRoles {
    private int idUsuario;
    private int idRol;

    // Constructor vacío
    public UsuarioRoles() {
    }

    // Constructor con todos los atributos
    public UsuarioRoles(int idUsuario, int idRol) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
    }

    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
}