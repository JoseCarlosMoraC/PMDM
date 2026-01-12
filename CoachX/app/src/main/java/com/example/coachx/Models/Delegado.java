package com.example.coachx.Models;

import java.util.Objects;

public class Delegado {
    private int id;
    private int usarioId;

    public Delegado(int id, int usarioId) {
        this.id = id;
        this.usarioId = usarioId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsarioId() {
        return usarioId;
    }

    public void setUsarioId(int usarioId) {
        this.usarioId = usarioId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Delegado delegado = (Delegado) o;
        return id == delegado.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
