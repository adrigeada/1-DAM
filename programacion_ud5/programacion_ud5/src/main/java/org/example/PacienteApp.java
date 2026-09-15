package org.example;

public class PacienteApp {
    static void main() {


        Paciente adri = new Paciente();

        System.out.println(adri.getDni() + " "+ adri.getNombre() );

        Paciente prueba = new Paciente("Patri", 32, 'M' , 60, 166);

        System.out.println(prueba.calcularIMC());

        if (prueba.esMayorDeEdad()){
            System.out.println("Mayor de edad");
        }else {
            System.out.println("Menor de edad");
        }

        Paciente pepe = new Paciente("Pepe",80,'G',80,180);

        System.out.println(pepe.getGenero());

        System.out.println(pepe);


    }
}
