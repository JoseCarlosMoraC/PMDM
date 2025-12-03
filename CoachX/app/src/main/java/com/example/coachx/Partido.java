package com.example.coachx;

import java.time.LocalDate;
import java.util.Objects;

public class Partido {
    private  int id;
    private int equidoId;
    private String rival;
    private LocalDate fecha;
    private String lugar;

    public Partido(int id, int equidoId, String rival, LocalDate fecha, String lugar) {
        this.id = id;
        this.equidoId = equidoId;
        this.rival = rival;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquidoId() {
        return equidoId;
    }

    public void setEquidoId(int equidoId) {
        this.equidoId = equidoId;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Partido partido = (Partido) o;
        return id == partido.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
