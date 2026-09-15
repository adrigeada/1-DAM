package org.example.EjerciciosSerializacion;

import org.example.EjerciciosSerializacion.ej1.Equipo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Ej3 {
    static ArrayList<Equipo> listaDeserializada;
    static void main(String[] args) {

        String nombreArchivo = "listita.ser";

            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/org/example/EjerciciosSerializacion/archivos/"+nombreArchivo));
                listaDeserializada= (ArrayList<Equipo>) in.readObject();
                System.out.println("Objeto deserializado.");
                in.close();

                System.out.println("Recorriendo objeto deserializado:");
                for (Equipo equipo : listaDeserializada){
                    System.out.println("\nNombre: "+equipo.getNombre());
                    System.out.println("Deporte: "+equipo.getDeporte());
                    System.out.println("Campeonatos ganados: "+equipo.getCampeonatos());
                }

            }catch (IOException  | ClassNotFoundException e){
                e.printStackTrace();
                System.out.println("Objeto con nombre "+nombreArchivo+" no encontrado.");
                serializarObjeto(nombreArchivo);

            }

    }

    static void serializarObjeto(String nombreArchivo){
            try {
                listaDeserializada = new ArrayList<>(Arrays.asList(new Equipo("Defecto","Defecto",0),new Equipo("Defecto2","Defecto2",0)));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/org/example/EjerciciosSerializacion/archivos/"+nombreArchivo));
                out.writeObject(listaDeserializada);

                out.close();


            } catch (IOException e) {
                System.out.println("mal mal mal :(");
                e.printStackTrace();
            }

            System.out.println("Objeto serializado");
            main(null);
    }

}
