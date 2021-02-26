package com.registro.model;

public class Usuario {
    private int id_usuario;
    private String email;
    private String nombre;
    private String password;

    //ctr


    public Usuario(int id_usuario, String email, String nombre, String password) {
        this.id_usuario = id_usuario;
        this.email = email;
        this.nombre = nombre;
        this.password = password;
    }

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
