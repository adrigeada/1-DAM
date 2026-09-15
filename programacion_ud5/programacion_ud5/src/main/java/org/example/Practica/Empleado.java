package org.example.Practica;

import java.util.Arrays;

/**
 * PRE_ID es el prefijo que se usa al crear los id de los empleados. Se añade al contadorID. El contador se suma cada vez que se crea un empleado
 * CARGO_DIRECTOR se usa para controlar si el empleado añadido es director o no
 * POSIBLES_CARGOS  es un array donde están los cargos aceptados de empleados. Si el cargo no coincide con uno de ellos se les asigna CARGO_DEFAULT
 */
public class Empleado {
    private static final String PRE_ID = "EP";
    private static final String CARGO_DIRECTOR = "director";
    private static final String[] POSIBLES_CARGOS = new String[] {"director", "tecnico", "presentador", "colaborador"};
    private static final String CARGO_DEFAULT = "pte";

    private static int contadorID = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;


    public Empleado(String nombre,String cargo,Empleado director){
        ++contadorID;
        id = setId();
        this.nombre = nombre;
        this.cargo = setCargo(cargo);
        asignarDirector(director);
    }


    public void asignarDirector(Empleado director){ //Controla que a un director no se le pueda asginar un director

        if (cargo.equals(CARGO_DIRECTOR)){
            this.director = null;
        }else {
            this.director = director;
        }

    }

    public String getId() {
        return id;
    }

    private static String setId() {
       return PRE_ID+contadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String setCargo(String cargo) {//Controla que el cargo que se ha usado es válido entre la lista de  POSIBLES_CARGOS

        if (Arrays.asList(POSIBLES_CARGOS).contains(cargo)){
            return cargo;
        }else {
            System.out.println("El cargo '"+cargo+"' no es posible. Cargo por defecto usado.");
            return CARGO_DEFAULT;
        }

    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
