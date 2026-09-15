package org.example.EjerciciosSerializacion;

import org.example.EjerciciosSerializacion.ej1.Equipo;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ej4 {
    static void main(String[] args) {

        HashMap<String,Equipo> mapaEquipos = new HashMap<>();
        Equipo equipo1 = new Equipo("Lakers","Basket",20);
        Equipo equipo2 = new Equipo("Boston","Basket",18);
        Equipo equipo3 = new Equipo("Miami","Basket",3);

        mapaEquipos.put("Activo",equipo1);
        mapaEquipos.put("Eliminado",equipo2);
        mapaEquipos.put("Malardo",equipo3);

        serializarMapa(mapaEquipos);
        HashMap<String,Equipo> mapadeserializado = deserializarMapa();
        TreeMap<String,Equipo> mapaOrdenado = new TreeMap<>();

        for (Map.Entry<String,Equipo> mapita : mapadeserializado.entrySet()){
            mapaOrdenado.put(mapita.getKey(),mapita.getValue());
        }

        for (Map.Entry<String,Equipo> mapota : mapaOrdenado.entrySet()){
            System.out.println(mapota.getKey()+ " : "+mapota.getValue());
        }


    }

    static void serializarMapa(HashMap<String,Equipo> objeto){

        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/org/example/EjerciciosSerializacion/archivos/mapa.ser"));
            out.writeObject(objeto);
            out.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static HashMap<String,Equipo> deserializarMapa(){
        HashMap<String,Equipo> mapadeserializado = new HashMap<>();

        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/org/example/EjerciciosSerializacion/archivos/mapa.ser"));
            mapadeserializado = (HashMap<String, Equipo>) in.readObject();
            in.close();

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }


        return mapadeserializado;
    }
}
