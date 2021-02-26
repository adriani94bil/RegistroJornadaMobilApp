package com.registro.model;

import java.util.Date;
import java.util.Timer;

public class Horario {
    private int id_horario;
    private Date Fecha;
    private Timer Hora_Entrada;
    private Timer Hora_Salida;
    private int id_usuario;

    //ctr


    public Horario(int id_horario, Date fecha, Timer hora_Entrada, Timer hora_Salida, int id_usuario) {
        this.id_horario = id_horario;
        Fecha = fecha;
        Hora_Entrada = hora_Entrada;
        Hora_Salida = hora_Salida;
        this.id_usuario = id_usuario;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Timer getHora_Entrada() {
        return Hora_Entrada;
    }

    public void setHora_Entrada(Timer hora_Entrada) {
        Hora_Entrada = hora_Entrada;
    }

    public Timer getHora_Salida() {
        return Hora_Salida;
    }

    public void setHora_Salida(Timer hora_Salida) {
        Hora_Salida = hora_Salida;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
