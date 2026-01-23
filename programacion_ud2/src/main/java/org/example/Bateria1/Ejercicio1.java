package org.example.Bateria1;

public class Ejercicio1 {
    static void main() {
        String frase = "Prueba ejercicios carácteres";
        System.out.println("a) Texto original: " +frase);

        int longitud = frase.length();
        System.out.println("b) La longitud del texto es: "+longitud);

        String frase_reemplazo = frase.replace(" ", ""); //los espacios los reemplazo por "no espacio"
        System.out.println("c) "+frase_reemplazo);

        String primeraparte = frase.substring(0,14);
        String segundaparte = frase.substring(14);
        System.out.println("d) La primera parte de la frase es: "+primeraparte+ ", y la segunda parte de la frase es: "+segundaparte);
        System.out.println(primeraparte.concat(segundaparte)); //otra forma de concatenar

        System.out.println("e) "+frase.toUpperCase());
    }
}
