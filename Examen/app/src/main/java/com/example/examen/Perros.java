package com.example.examen;

public class Perros {
    private int id;
    private String nombre;
    private String raza;
    private int clienteId;

    public Perros(int id, String nombre, String raza, int clienteId) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.clienteId = clienteId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
