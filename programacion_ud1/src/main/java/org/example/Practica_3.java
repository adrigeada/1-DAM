package org.example;

import java.util.Scanner;

public class Practica_3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        final int ALTURAMAX = 230; // Pongo estas constantes porque son datos que no van a cambiar.
        final int ALTURAMIN = 140;
        final int PESOMAX = 120;
        int altura = 0;             // Tengo que meter las variables de altura y peso porque se usan en el try catch
        int peso = 0;
        boolean repetir1 = false;   // Repetidores para parar el loop de do while del try catch.
        boolean repetir2 = false;


        do {                    //Con este try catch se asegura que los datos metidos son números enteros.
            try {
                System.out.println("Bienvenido a La Rateta Vacileta. Introduce tu altura en cm. "); //Introducción a la atracción, pido la altura en cm y la leo.
            altura = teclado.nextInt();
            repetir1 = true;

        }catch (Exception e){
            System.out.println(" ERROR. El formato tiene que ser números enteros.");
        }
            teclado.nextLine();
        }while (repetir1==false);


        if (altura < ALTURAMIN && altura > 0){  //Si la altura es menor que 140, que es la altura minima, y además es mayor que cero, (para evitar números negativos) te calcula cuantos centimetros te faltan para llegar a 140 y te dice los cm que te faltan.
            int faltaaltura = ALTURAMIN - altura;
            System.out.println("Lo siento no puedes montar en la atracción te faltan " +faltaaltura+ "cm");

        } else if (altura > ALTURAMAX || altura <= 0) { // Si no se cumple lo anterior pero la altura es mayor que 230 o la altura es negativa. Salta mensaje de error.
            System.out.println("Error de lectura. Baja de la báscula y vuelve a subir");
            
        }else {                                 // Si no pasa ninguna de las dos condiciones anteriores, primero te calcula el peso minimo "pesomin" con tu altura y lo guarda. Después te pide el peso.
            float pesomin = (altura * 2)/8;     // El peso minimo está guardado en float por que pueden salir decimales de la división,


        do {
            try {
            System.out.println("Introduce tu peso en Kg ");
            peso = teclado.nextInt();
            repetir2 = true;

        }catch (Exception e){
            System.out.println("ERROR. El formato tiene que ser números enteros."); // Otro try catch para que solo se puedan meter números enteros,
        }
            teclado.nextLine();

        }while (repetir2==false);


                                                        //Con el peso mínimo calculado y tu peso leído, comprueba que superas el peso minimo.
                if (peso < pesomin){                  //Si no lo superas te avisa que no puedes subir a la atracción.
                System.out.println("Lo siento no superas el peso mínimo requerido.");
            } else if (peso > PESOMAX) {            //Si superas el peso mínimo, luego comprueba que no superas el peso máximo.
                int sobrepeso = peso - PESOMAX;     //Si superas el peso máximo, te calcula por cuantos kilos te pasas " sobrepeso" del peso máximo y te lo dice.
                System.out.println("Lo siento sobrepasas el límite de la atracción por " +sobrepeso+ "Kg");
                
            }else {
                System.out.println("Pesas " +peso+ "Kg. Peso mínimo calculado: " +pesomin+ "Kg. ¡SUBE A LA ATRAACIÓN!"); // Si no superas el peso máximo, te dice tu peso "peso", Te informa de tu peso mínimo "pesomin" y te invita a subir a la atracción.

            }


        }


    }
}
