package org.example.EjerciciosSerializacion.ej5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Ej5 {
    static void main(String[] args) {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>(Arrays.asList(new Empleado("Adrian",1700),new Jefe("Patri",2100,"Informatica"),new Empleado("Samu",1600)));

        serializar(listaEmpleados);

        ArrayList<Empleado> listaRecuperada = deserializar();

        recorrerLista(listaRecuperada);




    }

    static void serializar(ArrayList<Empleado> lista){

        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/org/example/EjerciciosSerializacion/archivos/listaEmpleados.ser"));
            out.writeObject(lista);
            out.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    static ArrayList<Empleado> deserializar(){

        ArrayList<Empleado> listaRecuperada = new ArrayList<>();

        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/org/example/EjerciciosSerializacion/archivos/listaEmpleados.ser"));
            listaRecuperada = (ArrayList<Empleado>) in.readObject();
            in.close();

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return listaRecuperada;
    }

    static void recorrerLista(ArrayList<Empleado> lista){

        for (Empleado empleado : lista){
            if (empleado instanceof Jefe ){
                System.out.println("Departamento: "+((Jefe) empleado).getDepartamento());
            }
            System.out.println("Nombre: "+empleado.getNombre());
            System.out.println("Salario: "+empleado.getSalario()+"\n");
        }

    }
}
