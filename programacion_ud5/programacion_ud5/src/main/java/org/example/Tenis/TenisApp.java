package org.example.Tenis;

public class TenisApp {
    static void main() {

        Jugador nadal = new Jugador("Rafa",1);
        Jugador federer = new Jugador("Roger",2);
        Partido pachanga = new Partido(nadal,federer);

         System.out.println(nadal.getRival());
        System.out.println(federer.getRival());


        pachanga.insertarSet(6,6);
        pachanga.insertarSet(0,0);
        pachanga.insertarSet(4,6);
        pachanga.insertarSet(0,6);


        System.out.println(pachanga.getListaSets());








    }
}
