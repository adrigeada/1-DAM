package org.example.Practica;

import java.util.ArrayList;

public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre){
        this.nombre = nombre;
        listaProgramas = new ArrayList<>();
    }

    public void anyadirPrograma(Programa programa){
        listaProgramas.add(programa);
    }

    public void borrarPrograma(Programa programa){
        listaProgramas.remove(programa);
    }

    public void mostrarListaProgramas (){
        for (Programa programa : listaProgramas){
            System.out.println("- "+programa);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                "Lista Programas" + listaProgramas+
                '}';
    }
}
