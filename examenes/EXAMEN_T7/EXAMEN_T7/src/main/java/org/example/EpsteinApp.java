package org.example;

import java.util.*;

public class EpsteinApp {

    static ArrayList<Famoso> listaEpstein = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);

    static void main() {

        procesarDatos();
        nuevoFamoso();
        buscarFamoso();
        eliminarMenores();
       Estadistica estadistica =generarEstadistica(listaEpstein);

       estadistica.verPoliticos();
       estadistica.informeJuzgado();
       estadistica.verRanking();


    }

    public static void procesarDatos(){
        EntradaDatos.generarDatos();
        Queue<Famoso> colaFamosos = EntradaDatos.getDatosActuales();

        System.out.println("Procesando datos desde EntradaDatos...");

        while (!colaFamosos.isEmpty()){

            System.out.println("--Grabando "+colaFamosos.peek());

            Famoso famoso = colaFamosos.poll();
            listaEpstein.add(famoso);

        }
    }

    public static Famoso pedirDatos(){
        String nombre = "";
        String pais = "";
        String profesion = "";
        int edad = 0;


        System.out.println("Nombre: ");
        nombre = teclado.nextLine();
        System.out.println("País: ");
        pais = teclado.nextLine();
        System.out.println("Profesión: ");
        profesion = teclado.nextLine();
        System.out.println("Edad:");
        edad = teclado.nextInt();
        teclado.nextLine();


        Famoso famoso = new Famoso(nombre,pais,profesion,edad);

        return famoso;
    }

    public static void nuevoFamoso(){

        System.out.println("\nInsertando famoso...");

        Famoso famoso = pedirDatos();
        listaEpstein.add(famoso);

        System.out.println("Famoso insertado.");
    }

    public static void buscarFamoso(){
        System.out.println("Buscando famoso...");

        Famoso famoso = pedirDatos();

        if (listaEpstein.contains(famoso)){
            System.out.println("El famoso HA ACUDIDO a la Isla");
        }else {
            System.out.println("El famoso no está en la lista de Epstein");
        }


    }

    public static void eliminarMenores(){
        System.out.println("\nEliminando menores de edad...");
        Iterator<Famoso> it = listaEpstein.iterator();

        while (it.hasNext()){
            Famoso famoso = it.next();

            if (famoso.getEdad()<18){

                System.out.println("-- "+famoso.getNombre()+" fulminado");
                it.remove();
            }


        }

    }

    public static Estadistica generarEstadistica(ArrayList<Famoso> lista){

        Estadistica estadistica = new Estadistica(lista);

        return estadistica;
    }
}
