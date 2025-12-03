package com.example.examen;

public class Cita {
    private int id;
    private int perroId;
    private int peluqueriaId;
    private String fecha;
    private String hora;
    private String nombrePerro;
    private String nombreCliente;

    public Cita(int id, int perroId, int peluqueriaId, String fecha, String hora, String nombrePerro, String nombreCliente) {
        this.id = id;
        this.perroId = perroId;
        this.peluqueriaId = peluqueriaId;
        this.fecha = fecha;
        this.hora = hora;
        this.nombrePerro = nombrePerro;
        this.nombreCliente = nombreCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeluqueriaId() {
        return peluqueriaId;
    }

    public void setPeluqueriaId(int peluqueriaId) {
        this.peluqueriaId = peluqueriaId;
    }

    public int getPerroId() {
        return perroId;
    }

    public void setPerroId(int perroId) {
        this.perroId = perroId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}