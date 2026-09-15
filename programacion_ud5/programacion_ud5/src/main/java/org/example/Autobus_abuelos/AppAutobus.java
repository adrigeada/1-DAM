package org.example.Autobus_abuelos;

public class AppAutobus {
    static void main() {

        Abuelo juan = new Abuelo("Juan", 89);
        Abuelo jose = new Abuelo("Jose", 67);
        Abuelo angeles = new Abuelo("Ángeles", 72);
        Abuelo euge = new Abuelo("Eugenia",68);

        AutobusImserso alsa = new AutobusImserso("1234ASD","Albacete");

        alsa.insertarAbuelo(juan);
        alsa.insertarAbuelo(jose);
        alsa.insertarAbuelo(angeles);
        alsa.insertarAbuelo(euge);

         System.out.println(alsa.getListaAbuelos());

         alsa.borrarAbuelo(euge);

        System.out.println(alsa.getListaAbuelos());

        alsa.mostrarAbuelo();
        alsa.mostrarMayores(70);
    }

}
