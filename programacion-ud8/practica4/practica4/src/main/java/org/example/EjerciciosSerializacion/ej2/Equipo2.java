package org.example.EjerciciosSerializacion.ej2;

import java.io.Serializable;

public class Equipo2 implements Serializable {
    private String nombre;
    private transient String deporte;
    private int campeonatos;

    public Equipo2(String nombre, String deporte, int campeonatos) {
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
