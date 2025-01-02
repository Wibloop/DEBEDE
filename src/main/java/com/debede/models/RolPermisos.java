package com.debede.models;

public class RolPermisos {
    private int idRol;
    private int idPermiso;

    // Constructor vacío
    public RolPermisos() {
    }

    // Constructor con todos los atributos
    public RolPermisos(int idRol, int idPermiso) {
        this.idRol = idRol;
        this.idPermiso = idPermiso;
    }

    // Getters y Setters
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }
}
