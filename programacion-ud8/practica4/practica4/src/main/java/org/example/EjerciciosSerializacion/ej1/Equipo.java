package org.example.EjerciciosSerializacion.ej1;

import java.io.Serializable;

public class Equipo implements Serializable {
    private String nombre;
    private String deporte;
    private int campeonatos;

    public Equipo(String nombre, String deporte, int campeonatos) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.campeonatos = campeonatos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", deporte='" + deporte + '\'' +
                ", campeonatos=" + campeonatos +
                '}';
    }
}
