package org.example.Practica;

import java.time.LocalDate;

public class AppProgramas {
    static void main() {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        Programa hormiguero = new Programa("Hormiguero",antena3,"Director1");
        Programa revuelta = new Programa("Revuelta",antena3,"Ricardo");
        System.out.println(antena3);

        hormiguero.anyadirEmpleado("Pablito","presentador");
        hormiguero.anyadirEmpleado("Paco","director");
        hormiguero.anyadirEmpleado("Vicen","programador");
        System.out.println(hormiguero);

       hormiguero.anyadirInvitado("Aitana","Cantante",1);
       hormiguero.anyadirInvitado("Aitana","Comico",2);
       hormiguero.anyadirInvitado("Broncano","payaso", 1);
       revuelta.anyadirInvitado("Aitana","Cantante",1);

       hormiguero.invitadosTemporada(1);
       hormiguero.rastrearInvitado("Aitana");


       if (hormiguero.buscarInvitado("Aitana") && revuelta.buscarInvitado("Aitana")){
           invitadoAntes("Aitana",hormiguero,revuelta);
       }

        System.out.println(hormiguero.getListaInvitados());

    }

    /*
    Este metodo recive el nombre de un invitado y dos programas. Entonces encuentra la fecha en la que fue a los programas y las compara. Luego te dice a que programa fue primero.
     */
    public static void invitadoAntes (String nombre,Programa programa1, Programa programa2){

        LocalDate fecha1 = null;
        LocalDate fecha2 = null;

        for (Invitado invitado : programa1.getListaInvitados()){
            if (invitado.getNombre().equals(nombre)){
                fecha1 = invitado.getFechaVisita();
            }
        }

        for (Invitado invitado : programa2.getListaInvitados()){
            if (invitado.getNombre().equals(nombre)){
                fecha2 = invitado.getFechaVisita();
            }
        }

        if (fecha1.isBefore(fecha2)){
            System.out.println(nombre+" fue al programa "+programa1.getNombre()+" primero.");
        }else {
            System.out.println(nombre+" fue al programa "+programa2.getNombre()+ " primero.");
        }

    }
}
