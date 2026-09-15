package org.example.Biblioteca;

import java.util.ArrayList;

public class Editorial {

    private String nombre;
    private String pais;
    private ArrayList<Libro> librosEditorial;


    public Editorial(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
        librosEditorial = new ArrayList<>();
    }

    public Editorial (){

    }

    public void insertarLibro(Libro libro){
        librosEditorial.add(libro);
    }

    public void borrarLibro(Libro libro){
        librosEditorial.remove(libro);
    }

    public ArrayList<Libro> getLibrosEditorial() {
        return librosEditorial;
    }

    public void setLibrosEditorial(ArrayList<Libro> librosEditorial) {
        this.librosEditorial = librosEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                //", librosEditorial=" + librosEditorial +
                '}';
    }
}
