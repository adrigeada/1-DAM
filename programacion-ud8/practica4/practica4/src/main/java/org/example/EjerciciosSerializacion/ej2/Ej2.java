package org.example.EjerciciosSerializacion.ej2;

import org.example.EjerciciosSerializacion.ej1.Equipo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Ej2 {
    static void main(String[] args) {


        ArrayList<Equipo2> listaEquipos = new ArrayList<>(Arrays.asList(new Equipo2("Lakers","Basket",20),new Equipo2("Celtics","Basket",18),new Equipo2("Miami","Basket",3)));

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/org/example/EjerciciosSerializacion/archivos/lista.ser"));
            out.writeObject(listaEquipos);

            out.close();


        } catch (IOException e) {
            System.out.println("mal mal mal :(");
            e.printStackTrace();
        }

        System.out.println("Objeto serializado");

        ArrayList<Equipo2> listaDeserializada = new ArrayList<>();

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/org/example/EjerciciosSerializacion/archivos/lista.ser"));
            listaDeserializada= (ArrayList<Equipo2>) in.readObject();
            System.out.println("Objeto deserializado.");
            in.close();

            System.out.println("Recorriendo objeto deserializado:");
            for (Equipo2 equipo : listaDeserializada){
                System.out.println("\nNombre: "+equipo.getNombre());
                System.out.println("Deporte: "+equipo.getDeporte());
                System.out.println("Campeonatos ganados: "+equipo.getCampeonatos());
            }

        }catch (IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
