package com.example.proyectocoachx.Models;

import java.util.List;
import java.util.Objects;

public class Club {
    private int id;
    private String nombre;
    private String escudo;
    private String contacto;
    private List<Equipo> equipos;

    public Club(int id, String nombre, String escudo, String contacto, List<Equipo> equipos) {
        this.id = id;
        this.nombre = nombre;
        this.escudo = escudo;
        this.contacto = contacto;
        this.equipos = equipos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Club club = (Club) o;
        return id == club.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
