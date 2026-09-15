package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        Bocadillo pepito = new Bocadillo("Pepito","normal","bacon","Kepchup",10.0); //se llama al constructor que recive todos los parametros

        pepito.imprimirInfoBocata();

        System.out.println(pepito.getNombre() + " " + pepito.getPrecio() + " €");

        Bocadillo vacio = new Bocadillo(); //se llama al constructor vacio

        vacio.setNombre("Chivito"); // se le cambia el nombre del bocadillo vacío a chivito.

        vacio.imprimirInfoBocata();
    }
}
