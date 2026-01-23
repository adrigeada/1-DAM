package org.example;

public class swicth_ejemplo {
    static void main() {
        int numero =  1;
        char caracter = 'A';
        String palabra = "Patricia";

        switch (palabra){
            case "Raul":
                System.out.println("El alumno es raul");
                break;  //hay que poner break porque sino hace los siguientes pasos
            case "Patricia":
                System.out.println("La profe es patricia");
                break;
            default:
                System.out.println("No se el nombre");
                break;

        }//para char es con comillas simples case 'A'

        switch (numero){
            case 1:
                System.out.println("el numero es 1");
                break;
            case 2:
                System.out.println("el numero es 2");
                break;
            default:
                System.out.println("no es ni 1 ni 2");
                break;

        }


    }
}
