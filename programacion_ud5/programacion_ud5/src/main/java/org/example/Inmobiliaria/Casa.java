package org.example.Inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;

    public Casa (String direccion){
        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();
    }

    public void crearHabitacion (String nombre, double metros){

        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitación con nombre "+ nombre+ ", ya existe.");
                return;
            }

        }

        Habitacion habitacion = new Habitacion(nombre,metros);
        listaHabitaciones.add(habitacion);
        System.out.println("Habitacion "+nombre+ " creada.");
    }

    public void mostrarHabitaciones(){

        System.out.println("Casa de propietario "+ propietario.getNombre()+" en " + direccion+ " tiene " + listaHabitaciones.size()+ " habitaciones.");
        for (Habitacion habitacion : listaHabitaciones){
            System.out.println("- "+habitacion.getNombre()+ " ("+ habitacion.getMetros()+ ") m2");
        }
    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion mayor = listaHabitaciones.get(0);

        for (Habitacion habitacion: listaHabitaciones){

            if (habitacion.getMetros() > mayor.getMetros()){
                mayor = habitacion;
            }

        }

        return mayor;
    }

    public void eliminarHabitacion(String nombre){

        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitacion "+nombre+ " borrada con éxito.");
                return;
            }
        }

        System.out.println("La habitación "+nombre+ " no existe.");

    }


    public void mayorConsumo(){
        double maxConsumo = 0;
        Habitacion habitacionMax = null;
        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.calcularConsumo() > maxConsumo){
                maxConsumo = habitacion.calcularConsumo();
                habitacionMax = habitacion;
            }
        }
        System.out.println("La habitacion con mayor consumo de la casa es: "+ habitacionMax.getNombre());
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {

        System.out.println("Introduce el nombre del propietario");
        String nombre = teclado.next();
        teclado.nextLine();
        System.out.println("Edad;");
        int edad = teclado.nextInt();
        teclado.nextLine();

        Propietario propietario = new Propietario(nombre,edad);
        this.propietario = propietario;
        System.out.println("Propietario " + nombre+ " añadido.");
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "propietario= "+propietario+ '\'' +
                '}';
    }
}
