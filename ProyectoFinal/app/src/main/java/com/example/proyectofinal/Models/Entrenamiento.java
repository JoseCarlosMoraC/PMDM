package com.example.proyectofinal.Models;

import java.time.LocalDate;
import java.util.Objects;

public class Entrenamiento {
    private int id;
    private int equipoId;
    private LocalDate fecha;
    private String tipo;
    private double carga;
    private String objetivo;

    public Entrenamiento(int id, int equipoId, LocalDate fecha, String tipo, double carga, String objetivo) {
        this.id = id;
        this.equipoId = equipoId;
        this.fecha = fecha;
        this.tipo = tipo;
        this.carga = carga;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(int equipoId) {
        this.equipoId = equipoId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entrenamiento that = (Entrenamiento) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
