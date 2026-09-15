package org.example;

import java.util.Scanner;

public class PacienteEjecutable {
    static Scanner teclado = new Scanner(System.in);
    static void main() {

        System.out.println("Escribe tu nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Escribe tu edad:");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Escribe tu género:");
        char genero = teclado.next().charAt(0);
        System.out.println("Escribe tu peso");
        double peso = teclado.nextDouble();
        System.out.println("Escribe tu altura: ");
        int altura = teclado.nextInt();

        Paciente Juan = new Paciente(nombre,edad,genero,peso,altura);
        Paciente Alberto = new Paciente(nombre,edad,genero,0,0);
        Paciente Antonio = new Paciente();

        Antonio.setNombre("Antonio");
        Antonio.setEdad(30);
        Antonio.setGenero('H');
        Antonio.setPeso(80);
        Antonio.setAltura(150);

       calcularIMC(Juan,Antonio,Alberto);

    }


    public static void calcularIMC(Paciente Juan, Paciente Antonio, Paciente Alberto){

        System.out.println("Datos Juan");
        Juan.mostrarInfoPaciente();
        if (Juan.calcularIMC()== 1){
            System.out.println("Juan tiene sobrepeso");
        } else if (Juan.calcularIMC() == 0) {
            System.out.println("Juan esta en el peso ideal");
        }else if (Juan.calcularIMC()==-1){
            System.out.println("Juan está por debajo del peso ideal");
        }else {
            System.out.println("");
        }
        if (Juan.esMayorDeEdad()){
            System.out.println("Mayor de edad");
        }else {
            System.out.println("Menor de edad");
        }

        System.out.println("--------------------------------------");
        System.out.println("");

        System.out.println("Datos Alberto");
        Alberto.mostrarInfoPaciente();

        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("Datos Antonio");
        Antonio.mostrarInfoPaciente();


    }


}
