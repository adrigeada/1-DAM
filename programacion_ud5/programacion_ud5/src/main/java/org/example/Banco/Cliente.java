package org.example.Banco;

import java.util.Scanner;

public class Cliente {
    static Scanner teclado = new Scanner(System.in);

    private static int contador_id = 0;

    private int id;
    private String nombre;
    private String apellidos;

    public Cliente (){
        ++contador_id;
        id = setId();
        nombre = setNombre();
        apellidos = setApellidos();
    }

    public int getId() {
        return id;
    }

    public int setId() {
        return contador_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre() {
        System.out.println("Escribe tu nombre");
        return teclado.nextLine();
    }

    public void cambioNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String setApellidos() {
        System.out.println("Escribe tu apellido");
        return teclado.nextLine();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
