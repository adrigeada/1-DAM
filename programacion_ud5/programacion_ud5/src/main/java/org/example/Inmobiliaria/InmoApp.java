package org.example.Inmobiliaria;

public class InmoApp {
    static void main() {

        Casa piso = new Casa("Calle falsa,123");

        piso.crearHabitacion("Cocina",20);
        piso.crearHabitacion("Baño",7);
        piso.crearHabitacion("Dormitorio",21);
        piso.crearHabitacion("Dormitorio", 12);
        piso.getListaHabitaciones().get(0).agregarElectrodomestico("Nevera",0.5);
        piso.getListaHabitaciones().get(0).agregarElectrodomestico("Horno",2);
        piso.getListaHabitaciones().get(0).agregarElectrodomestico("Horno",2);
        piso.getListaHabitaciones().get(1).agregarElectrodomestico("Calentador",3);

        piso.mayorConsumo();

//        piso.getListaHabitaciones().get(0).mostrarElectrodomestico();
//
//        System.out.println("El consumo de la habitacion "+ piso.getListaHabitaciones().get(0).getNombre()+ " es: " +piso.getListaHabitaciones().get(0).calcularConsumo()+ "Kw");

//        System.out.println(piso.getPropietario());
//
//        piso.mostrarHabitaciones();
//
//        System.out.println("La habitacion mas grande es "+ piso.getHabitacionMasGrande().getNombre());
//
//        piso.eliminarHabitacion("Baño");
//        piso.eliminarHabitacion("Baño");
//        piso.mostrarHabitaciones();







    }
}
