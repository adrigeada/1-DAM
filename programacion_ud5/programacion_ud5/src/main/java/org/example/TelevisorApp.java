package org.example;

public class TelevisorApp {
    static void main(String[] args) {

        Televisor lg = new Televisor(); //televisor con el constructor vacio
        System.out.println("Canal por defecto: " + lg.getCanal() + ". Volumen por defecto: " +lg.getVolumen());
        lg.bajarCanal();
        lg.subirVolumen();

        System.out.println("Cambio el volumen a 100");
        lg.setVolumen(100);
        System.out.println("Intento subir de volumen");
        lg.subirVolumen();

        Televisor samsung = new Televisor(50,0);

        System.out.println(samsung.getCanal());
        samsung.subirCanal();
        samsung.bajarVolumen();





    }

}
