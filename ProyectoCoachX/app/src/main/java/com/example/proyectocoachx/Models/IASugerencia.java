package com.example.proyectocoachx.Models;

import java.time.LocalDate;
import java.util.Objects;

public class IASugerencia {
    private int id;
    private int jugadorId;
    private int entrenamiento;
    private String recomendacion;
    private LocalDate fecha;

    public IASugerencia(int id, int jugadorId, int entrenamiento, String recomendacion, LocalDate fecha) {
        this.id = id;
        this.jugadorId = jugadorId;
        this.entrenamiento = entrenamiento;
        this.recomendacion = recomendacion;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJugadorId() {
        return jugadorId;
    }

    public void setJugadorId(int jugadorId) {
        this.jugadorId = jugadorId;
    }

    public int getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(int entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IASugerencia that = (IASugerencia) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
