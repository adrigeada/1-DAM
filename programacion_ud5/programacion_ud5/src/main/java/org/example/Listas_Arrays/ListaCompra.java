package org.example.Listas_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ListaCompra {
    static void main() {
        Random aleatorio = new Random();

        ArrayList<String> listaCompra = new ArrayList<>();

        System.out.println("Lista de compra vacía: " + listaCompra.isEmpty());

        listaCompra.add("Arroz");

        System.out.println("Lista de compra vacía: " + listaCompra.isEmpty());

        listaCompra.addAll(Arrays.asList("Pollo","Yogur","Manzana", "Mandarina","Plátanos"));

        System.out.println(listaCompra);

        System.out.println(listaCompra.get(2));

        listaCompra.add(1,"Queso");
        System.out.println(listaCompra);

        System.out.println("Hay queso en la lista: "+listaCompra.contains("Queso"));

        String elemento = "Natillas";

        if (!listaCompra.contains(elemento)){
            listaCompra.add(elemento);
        }


        System.out.println(listaCompra.size());

        ArrayList<String> copia = new ArrayList<>(listaCompra);

        copia.clear();

        System.out.println("La copia está vacía? " + copia.isEmpty());

        boolean sonIguales = listaCompra.equals(copia);

        if (sonIguales){
            System.out.println("Las dos listas son iguales");
        }else {
            System.out.println("Las dos listas son diferentes");
        }

        copia.addAll(Arrays.asList("Queso","Pollo"));
        System.out.println("Lista copiada: " + copia);

        ArrayList<String> faltantes = new ArrayList<>(listaCompra);
        faltantes.removeAll(copia);

        System.out.println("Productos de la original que faltan en la copia: "+faltantes);

        ArrayList<Integer> precios = new ArrayList<>();

        for (int i = 0; i < listaCompra.size(); i++) {
            precios.add(aleatorio.nextInt(11));

        }

        System.out.println(listaCompra);
        System.out.println("Precios: " + precios);

        if (listaCompra.contains("Natillas")){
            listaCompra.set(listaCompra.indexOf("Natillas"),"Natillas de soja");
        }
        System.out.println(listaCompra);

    }
}
