package org.example;

public class Aapuntes_String {
    static void main() {

        String frase = "Al palo JuanFran del Atleti palo";
        int numero = 456;

        String numero_string = Integer.toString(numero); //pasar un numero entero a String
        int numerofrase = Integer.parseInt(frase); //pasar string a int. Si no hay un numero en el string salta error

        int tamanyo = frase.length();       //para saber el tamaño de un string. tamanyo es la lenght de frase
        System.out.println(tamanyo);        //te dice cuantos caracteres tiene frase

        System.out.println(frase.charAt(8)); //dime que hay en la posición 8 (la J de JuanFran)

        String trozo = frase.substring(8,16); //trozo son los caracteres que hay entre la posicion 8 y la 16
        System.out.println(trozo);

        String trozo_final = frase.substring(17); //que caracteres hay desde la posicion 17 al final. (Solo se pone 17)
        System.out.println(trozo_final);

        int posicion = frase.indexOf("palo"); //para ver en que posicion empieza palo en la frase (3)
        System.out.println(posicion);

        int posicion2 = frase.indexOf("palo",10); //hay dos palos, busca donde esta desde la posicion 10
        System.out.println(posicion2);

        int posicion_ultimo = frase.lastIndexOf("palo"); //hay dos palos, busca el ultimo palo
        System.out.println(posicion_ultimo);

        String frase_mayusculas = frase.toUpperCase(); //para pasar la frase a mayusculas
        System.out.println(frase_mayusculas);

        String frase_minusculas = frase.toLowerCase(); //para pasar la frase a minusculas
        System.out.println(frase_minusculas);

        String base_datos = "Raul          ";
        System.out.println(base_datos.trim() + "-" + base_datos+ "#"); //trim quita espacios vacios a la derecha

        boolean igual = base_datos.equals("Manolo");  //base de datos es igual a Manolo?
        System.out.println(igual);

        boolean igual2 = base_datos.trim().equals("Raul");  //base de datos es igual a Raul? Si fuera sin el trim seria false, pero con el trim si que es verdad que es igual a Raul
        System.out.println(igual2);

        boolean igual_sin_mayusculas = "Raul".equalsIgnoreCase("raul"); //ignora las mayusculas
        System.out.println(igual_sin_mayusculas);

        String frase_remplazo = frase.replace("palo","Florentino"); //replace cambia una palabra por otra
        System.out.println(frase_remplazo);

        String equipo = "Real Madrid";
        System.out.println(frase.concat(equipo));

        boolean contiene = frase.contains("palo");  //¿esta la palabra en el texto? si está da true, si no está da false.
        System.out.println(contiene);

        int unidades_int = Integer.parseInt(frase); //pasar a numeros enteros un String. Si no funciona es porque no hay numeros en esa frase, o en ese trozo de frase.



    }
}
