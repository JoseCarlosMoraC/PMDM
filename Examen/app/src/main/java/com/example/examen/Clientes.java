package com.example.examen;

public class Clientes {
    public Clientes(int id, String nombre, String apellidos, String telefono, String correo, String direccion, String preferenciaTurno) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.preferenciaTurno = preferenciaTurno;
    }

    private int id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private String direccion;
    private String preferenciaTurno;


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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPreferenciaTurno() {
        return preferenciaTurno;
    }

    public void setPreferenciaTurno(String preferenciaTurno) {
        this.preferenciaTurno = preferenciaTurno;
    }
}
