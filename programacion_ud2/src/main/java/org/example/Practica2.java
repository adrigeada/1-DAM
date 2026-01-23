package org.example;

import java.util.Scanner;

public class Practica2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        //Variables inicializadas
        double num1 = 0;
        double resultado = 0;
        double num2 = 0;

        System.out.println("Bienvenido a la calculadora rápida");
        System.out.println("Introduce el primer número");

        if (teclado.hasNextDouble()){
            num1 = teclado.nextDouble();    //Se lee el primer número introducido y se controla que sea un número
        }else {
            System.out.println("El formato tiene que ser numérico (asegúrate de usar comas para los números decimales)");
            return;
        }

        System.out.println("-----------------");
        System.out.println("[+]  -> Sumar");
        System.out.println("[-]  -> Restar");
        System.out.println("[x]  -> Multiplicar");
        System.out.println("[/]  -> Dividir");
        System.out.println("[R]  -> Raíz cuadrada");
        System.out.println("-----------------");
        System.out.println("Elige una operación");

        //Leemos el operador y lo pasamos a minúsculas para evitar problemas con la R y la X
        String operador = teclado.next();
        String operador_min = operador.toLowerCase();
        //Creamos un booleano que diga true si el operador es r o R, false otra cosa
        boolean raiz = operador_min.equals("r");

        //si no es una r se pide y se lee el segundo número y se controla que sea un número
        if (!raiz) {
            System.out.println("Introduce el segundo número");
            try {
                num2 = teclado.nextDouble();
            }catch (Exception e){
                System.out.println("El formato tiene que ser numérico (asegúrate de usar comas para los números decimales)");
                return;
            }
        }
        //si es una r se sale del if y no pide el segundo número. Continua el programa.

        //Usamos operador_min porque está pasado a minúsculas y no importará si la x y la r están en mayúsculas
        switch (operador_min){
            case "+":
                resultado = num1+num2;
                System.out.println("El resultado es: "+resultado); //Si el operador es un + se suman los números
                break;

            case "-":
                resultado = num1-num2;
                System.out.println("El resultado es: "+resultado); //Si el operador es un - se restan los números
                break;

            case "x":
                resultado = num1*num2;
                System.out.println("El resultado es: "+resultado); //Si el operador es x o X se multiplican los números
                break;

            case "/":
                if (num2 == 0){ //No se puede dividir entre 0, asi que hacemos un control por si el segundo numero es 0
                    System.out.println("No se puede dividir entre 0");
                }else {
                    resultado = num1/num2;
                    System.out.println("El resultado es :"+resultado); //si el operaador es / se dividen los números
                }
                break;

            case "r":
                if (num1 < 0){ //Se controlan los números negativos, ya que no se puede hacer raiz cuadrada de negativos
                    System.out.println("Número imaginario");
                }else {
                    resultado = Math.sqrt(num1); //Si el operador es una r o R, se calcula la raiz cuadrada del primer número
                    System.out.println("El resultado es :"+resultado);
                }
                break;

            default:        //Si el operador elegido no entra dentro de los enseñados en el menú, salta este mensaje.
                System.out.println("No has elegido un operador válido");
                break;
        }







    }
}
