package org.example;

import java.util.Scanner;

public class Práctica_4 {
    static void main () {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;              //Variables para los numeros de tres cifras que se introducen. Valor 0 para inicializarlo.
        int num2 = 0;
        boolean repetir1 = false;  //Repetidores para parar el bucle do while del try catch.
        boolean repetir2 = false;


        do {                        //Bucle del try catch para evitar datos introducidos que no sean números.
            try{
                do {
                    System.out.println("Introduce el multiplicando (3 cifras)");    //Pedimos el multiplicando y lo leemos num1
                    num1 = teclado.nextInt();
                    repetir1 = true;
                    if (num1 < 100 || num1 > 999){             //Si el número introducido es menor que 100 (tiene 2 cifras) o es mayor que 999 (tiene 4 cifras) salta error.
                        System.out.println("Error el número tiene que ser un número positivo de 3 cifras");
                    }
                }while (num1 < 100 || num1 > 999);          //Además si se cumple lo anterior, se vuelve a pedir que introduzca el número otra vez.

            }catch (Exception e){
                System.out.println("Error el formato tienen que ser números enteros");
            }
            teclado.nextLine();

        }while (repetir1==false);

        do {                                    //Se vuelve a repetir el paso anterior para pedir el multiplicador. Leemos num2
            try{
                do {
                    System.out.println("Introduce el multiplicador (3 cifras)");
                    num2 = teclado.nextInt();
                    repetir2 = true;
                    if (num2 < 100 || num2 > 999){
                        System.out.println("Error el número tiene que ser un número positivo de 3 cifras");
                    }
                }while (num2 < 100 || num2 > 999);

            }catch (Exception e){
                System.out.println("Error el formato tiene que ser números enteros");
            }
            teclado.nextLine();

        }while (repetir2==false);


        String numero_string = Integer.toString(num2);          //Se crea la variable numero_string. Se transforma el num2 en String. Ahora el num2 son 3 caracteres separados
        String unidades = numero_string.substring(2); //De la variable numero_string decimos que "unidades" es el caracter en la posicion 2. Teniendo en cuenta que las tres posiciones son 0 1 2.
        int unidades_int = Integer.parseInt(unidades);          //Ahora hacemos que el caracter en la posición 2 pase a ser un numero entero Int que podemos usar mas tarde en multiplicaciones.

        //String numero_string2 = Integer.toString(num2) Esto no hace falta porque num2 ya ha pasado a ser String en el paso anterior
        String decenas = numero_string.substring(1,2);  //y en este paso usas la variable creada en el anterior paso (Aclaraciones para mi, no para Patri :D )
        int decenas_int = Integer.parseInt(decenas);

        //String numero_string3 = Integer.toString(num2) (lo mismo que antes)
        String centenas = numero_string.substring(0,1);
        int centenas_int = Integer.parseInt(centenas);
                                                                //Se vuelve a repetir con las posiciones 1 y 0 creando numeros enteros Int.

        System.out.println("El producto de la multiplicación es: " +num1 * num2);   //Empezamos a "dibujar la multiplicación". Lo primero mostramos el resultado.
        System.out.println("El proceso es: ");
        System.out.println("   " +num1);                        //Primer numero introducido x el segundo número
        System.out.println("  x" +num2);
        System.out.println("-------");                          //Esta es la línea separatoria de la operación
        System.out.println("   " +unidades_int * num1);         //En la primera línea de la multiplicación se multiplica el numero más a la derecha del num2 (unidades) por el num1
        System.out.println("  "+decenas_int * num1+ "x");       //En la segunda línea se multiplica el numero del centro del num2 (decenas) por el num1
        System.out.println(" "+centenas_int * num1+ "xx");      //En la tercera línea se multiplica el numero de la iquierda del num2 (centenas) por el num1
        System.out.println("-------");                          //Línea separatoria
        System.out.println(num1 * num2);                        //Se muestra el resultado de la multiplicación




    }
}
