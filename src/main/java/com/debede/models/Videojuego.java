package com.debede.models;

public class Videojuego {
    private int idVideojuego;
    private int idUbicacion;
    private String nombre;
    private String descripcion;
    private int precio;
    private int stock;
    private String url;

    // Constructor vacío
    public Videojuego() {
    }

    // Constructor con todos los atributos
    public Videojuego(int idVideojuego, int idUbicacion, String nombre, String descripcion, int precio, int stock, String url) {
        this.idVideojuego = idVideojuego;
        this.idUbicacion = idUbicacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.url = url;
    }

    // Getters y Setters
    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
