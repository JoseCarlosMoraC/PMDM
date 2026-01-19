package com.example.proyectocoachx.Models;

import java.util.Objects;

public class AsistenciaEntrenamiento {
    private int id;
    private int entrenamientoId;
    private int jugadorId;
    private String estado;

    public AsistenciaEntrenamiento(String estado, int jugadorId, int entrenamientoId, int id) {
        this.estado = estado;
        this.jugadorId = jugadorId;
        this.entrenamientoId = entrenamientoId;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEntrenamientoId() {
        return entrenamientoId;
    }

    public void setEntrenamientoId(int entrenamientoId) {
        this.entrenamientoId = entrenamientoId;
    }

    public int getJugadorId() {
        return jugadorId;
    }

    public void setJugadorId(int jugadorId) {
        this.jugadorId = jugadorId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AsistenciaEntrenamiento that = (AsistenciaEntrenamiento) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
