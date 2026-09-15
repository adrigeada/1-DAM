package org.example.Listas_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaArray {

    static void main() {

        ArrayList<Integer> listaNotas = new ArrayList<>();

        listaNotas.add(5);
        listaNotas.add(10);
        listaNotas.add(6);

        System.out.println("Elementos en la lista: " +listaNotas.size());

        listaNotas.add(1,4);

        System.out.println("Elementos en la lista: " +listaNotas.size());

        System.out.println("Nota en la posicion 2: " + listaNotas.get(2));

        listaNotas.remove(1);

        System.out.println("Elementos en la lista: " +listaNotas.size());

        System.out.println(listaNotas);

        System.out.println("El 10 está en la posicion: " + listaNotas.indexOf(10));

        System.out.println("Las notas de Raul: ");

        for (Integer nota : listaNotas){
            System.out.println("Nota: " + nota);
        }

        for (int i = 0; i < listaNotas.size(); i++) {

            System.out.println("Nota de la asignatura "+ i + ": " + listaNotas.get(i));
        }

        listaNotas.set(0,10);

        System.out.println(listaNotas);


        Object copia_mala = listaNotas.clone();
        ArrayList<Integer> copia = new ArrayList<>(listaNotas);

        System.out.println(listaNotas.contains(6));

        System.out.println("Lista vacía? " + listaNotas.isEmpty());



        listaNotas.clear();
        System.out.println("Lista vacía? " + listaNotas.isEmpty());


        listaNotas.addAll(Arrays.asList(2,6,3,8));
        System.out.println(listaNotas);
    }
}
