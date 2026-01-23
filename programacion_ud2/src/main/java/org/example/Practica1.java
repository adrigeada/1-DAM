package org.example;

import java.util.Scanner;

public class Practica1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fechanacimiento = teclado.nextLine();

        //Tras guardar lo introducido en teclado como un String, lo medimos para controlar que el formato de la fecha introducida sea correcto
        //Si lo introducido por teclado tiene una longitud distinta a 10 es porque está mal.

        int longitud = fechanacimiento.length();
        if (longitud != 10){
            System.out.println("La fecha introducida tiene que tener 10 carácteres contando las barras");
        }else {
            //Localizo las posiciones de dia mes y año y las barras

            String dia = fechanacimiento.substring(0,2);
            String mes = fechanacimiento.substring(3,5);
            String anyo = fechanacimiento.substring(6,10);
            String barra1 = fechanacimiento.substring(2,3);
            String barra2 = fechanacimiento.substring(5,6);

            boolean barratest1 = barra1.equals("/"); //¿en el espacio de barra1 hay /? true si que la hay, false no la hay
            boolean barratest2 = barra2.equals("/");
            int diaint = 0;
            int mesint = 0;     //inicializar las varables para poder usarlas fuera del trycatch
            int anyoint = 0;


            if (barratest1 == false || barratest2 == false){
                System.out.println("Recuerda usar barras para separar los datos introducidos");
                //si en el espacio donde deben ir las barras no hay una barra salta este mensaje
            }else{
                try{
                    //paso los huecos de dia, mes y anyo a int, si en ese hueco no hubiera un numero saltaria error de java con letras rojas.
                    //Por eso este paso de string a int está en un try catch, para que capture ese fallo de java.
                    diaint = Integer.parseInt(dia);
                    mesint = Integer.parseInt(mes);
                    anyoint = Integer.parseInt(anyo);
                }catch (Exception e){
                    System.out.println("Formato dd/mm/aaaa introducido incorrecto");
                    return;
                    //para acabar el programa aqui en vez de continuar con el siguiente paso se pone un return
                }

                    //Si el try catch no salta es porque, efectivamente, hay numeros enteros en esos huecos
                    //Ahora pruebo que los dias, meses y anyos introducidos son correctos.

                if (diaint <= 0 || diaint > 31){
                    System.out.println("Los días no pueden ser negativos o mayores que 31");
                } else if (mesint <= 0 || mesint > 12) {
                    System.out.println("Los meses no pueden ser negativos o mayores que 12");
                } else if (anyoint <= 1900 || anyoint > 2025) {
                    System.out.println("Año introducido incorrecto");
                }else {

                    //una vez comprobado que los datos introducidos entran dentro de nuestros parámetros podemos calcular el resultado

                    int resultado = diaint + mesint + anyoint;
                    System.out.println(diaint + "+" + mesint + "+" + anyoint + "=" + resultado);

                    //Transformo el int resultado en string para poder separar los numeros y poder sumarlos por separado

                    String resultado_string = Integer.toString(resultado);

                    //Separar los caracteres de resultado un diferentes Strings para luego transformarlos en numeros int

                    String millares = resultado_string.substring(0, 1);
                    String centenas = resultado_string.substring(1, 2);
                    String decenas = resultado_string.substring(2, 3);
                    String unidades = resultado_string.substring(3);

                    //Transformar los string creados en numeros enteros para poder sumarlos

                    int millaresint = Integer.parseInt(millares);
                    int centenasint = Integer.parseInt(centenas);
                    int decenasint = Integer.parseInt(decenas);
                    int unidadesint = Integer.parseInt(unidades);

                    int resultadofinal = millaresint + centenasint + decenasint + unidadesint;

                    System.out.println(millares + "+" + centenas + "+" + decenas + "+" + unidades + "=" + resultadofinal);
                    System.out.println("Tu número de la suerte es: "+resultadofinal);


                }

            }

        }


    }
}
