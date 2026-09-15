package org.example.Olimpiadas;

import java.util.ArrayList;

public class AppOlimpiadas {
    static void main() {

    Equipo italia = new Equipo("Italia");

    Deportista uno = new Deportista("Uno",2,5,1998);
    Deportista dos = new Deportista("Dos",5,6,1995);
    Deportista tres = new Deportista("Tres",11,2,2002);

    italia.inscribirDeportista(uno);
    italia.inscribirDeportista(dos);
    italia.inscribirDeportista(tres);

    uno.inscribirse("ski");
    uno.inscribirse("snow");

        uno.setMedallas(2);
        dos.setMedallas(3);
        System.out.println(uno);
        System.out.println(italia);

        uno.verModalidades();

        System.out.println(italia.medallasTotales());
        italia.verMedallero();

        System.out.println(italia.deportistaTop());

        italia.verMedallasDeportista(tres);

        System.out.println(italia.deportistaMasJoven());


    }
}
