package org.example.Tenis;

import java.util.ArrayList;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaSets;

    public Partido(Jugador jugador1,Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.listaSets = new ArrayList<>();
        jugador1.asignarRival(jugador2);
        jugador2.asignarRival(jugador1);
    }

    public boolean validarPuntosSet(int puntosJ1,int puntosJ2){

        if (puntosJ1 < 0){
            System.out.println("Los puntos tienen que ser mayor a 0");
            return false;
        } else if (puntosJ1 > 7) {
            System.out.println("Los puntos no pueden ser mayor de 7");
            return false;
        } else if (puntosJ1 == 6 && puntosJ2 > 5) {
            System.out.println("Tiene que haber tie-break");
            return false;
        } else if (puntosJ1 == 7 && puntosJ2 != 6) {
            System.out.println("Faltan puntos del tie-break");
            return false;
        } else if (puntosJ1 <6 && puntosJ2 < 6) {
            System.out.println("No ha acabado el set");
            return false;
        }else {
            return true;
        }

    }

    public void insertarSet(int puntosJ1, int puntosJ2){

        if (validarPuntosSet(puntosJ1,puntosJ2) && validarPuntosSet(puntosJ2,puntosJ1)){
            System.out.println("Puntos añadidos");
            Set set = new Set(puntosJ1,puntosJ2);
            listaSets.add(set);
        }

    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public ArrayList<Set> getListaSets() {
        return listaSets;
    }

    public void setListaSets(ArrayList<Set> listaSets) {
        this.listaSets = listaSets;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "jugador1=" + jugador1 +
                ", jugador2=" + jugador2 +
                '}';
    }
}
