package org.example.Bateria_vectores;

public class Ejercicio9 {
    static void main() {
        String[] vector = {"me", "cago", "en", "los", "vectores", "de", "los", "cojones"};
       String palabra_primera= "";
       String palabra_max = "";

        for (int i = 0; i< vector.length; i++) {
            palabra_primera=vector[i];

            if (palabra_primera.length()>palabra_max.length()){
                palabra_max=palabra_primera;
            }

//            System.out.println(palabra_max);
        }
        System.out.println(palabra_max);

    }
}
