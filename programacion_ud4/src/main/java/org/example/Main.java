package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int num = 10;
       int numero = funcion(num);
        System.out.println(numero);
        procedimiento();
        System.out.println("He vuelto del procedimiento");

        pintar_nombres("patri","kevin","david");

    }
    public static int funcion(int numero){

        numero = numero+20;
        return numero*10;

    }

    public static void procedimiento(){

        System.out.println("Hola soy un procedimiento y hago mis cosas no devolviendo nada");
    }

    public static void pintar_nombres (String... nombre){ //los puntos suspensivos es para cuando va a recibir mas de un String. Hace un vector

        for (String fila : nombre){
            System.out.println(fila);
        }
    }


}



