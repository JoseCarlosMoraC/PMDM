package com.example.proyectofinal.Models;

import java.util.Objects;

public class Estadistica {
    private int id;
    private int partidosJugados;
    private int goles;
    private int minutos;
    private int tarjetas;
    private double rendimientoIndex;

    public Estadistica(int id, int partidosJugados, int goles, int minutos, int tarjetas, double rendimientoIndex) {
        this.id = id;
        this.partidosJugados = partidosJugados;
        this.goles = goles;
        this.minutos = minutos;
        this.tarjetas = tarjetas;
        this.rendimientoIndex = rendimientoIndex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(int tarjetas) {
        this.tarjetas = tarjetas;
    }

    public double getRendimientoIndex() {
        return rendimientoIndex;
    }

    public void setRendimientoIndex(double rendimientoIndex) {
        this.rendimientoIndex = rendimientoIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estadistica that = (Estadistica) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
