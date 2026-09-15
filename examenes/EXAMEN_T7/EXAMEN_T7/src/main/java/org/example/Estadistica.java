package org.example;

import java.util.*;

public class Estadistica implements Informes{

    private Map<Famoso,Integer> estadisticas = new HashMap<>();

    public Estadistica(ArrayList<Famoso> lista){
        estadisticas = getEstadisticas(lista);
    }


    public Map<Famoso, Integer> getEstadisticas(ArrayList<Famoso> lista) {

        for (Famoso famoso : lista){

            if (estadisticas.containsKey(famoso)){
                estadisticas.put(famoso,estadisticas.get(famoso)+1);
            }else {
                estadisticas.put(famoso,1);
            }

        }

        System.out.println("\nGenerando estadisticas...");

        for (Map.Entry<Famoso,Integer> mapita : estadisticas.entrySet()){

            System.out.println("-- "+mapita.getKey().getNombre()+": "+mapita.getValue()+" visitas");

        }

        return estadisticas;
    }

    public void setEstadisticas(Map<Famoso, Integer> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Estadistica{" +
                "estadisticas=" + estadisticas +
                '}';
    }

    @Override
    public void verPoliticos() {
        System.out.println("\nIdentificando a la clase política...");

        for (Map.Entry<Famoso,Integer> mapita : estadisticas.entrySet()){

            if (mapita.getKey().getProfesion().equalsIgnoreCase("Político")){

                System.out.println("-- "+mapita.getKey().getNombre()+" representando a "+mapita.getKey().getPais());

            }
        }

    }

    @Override
    public void informeJuzgado() {
        System.out.println("\nListado ordenado por paises");

        Set<Famoso> lista = new TreeSet<>(estadisticas.keySet());

        for (Famoso famoso : lista){
            System.out.println("#"+famoso.getPais()+" - "+famoso.getNombre());
        }


    }

    @Override
    public void verRanking() {
        int contador = 0;
        System.out.println("\nRanking (famosos con mas visitas):");
        List<Map.Entry<Famoso,Integer>> listaMapa = new ArrayList<>(estadisticas.entrySet());

        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Famoso,Integer> mapita : listaMapa){

            if (mapita.getValue()>1){
                contador++;
                System.out.println("#"+contador+" "+mapita.getKey().getNombre()+ " ("+mapita.getValue()+" visitas)");
            }

        }

    }
}
