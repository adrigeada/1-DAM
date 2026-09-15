package org.example.Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoApp {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Cuenta> listaCuentas = new ArrayList<>();

    static void main() {

        imprimirMenu1();
        eleccion1();



//
//        Cliente cliente = new Cliente();
//        listaClientes.add(cliente);
//
//        Cuenta cuenta = new Cuenta();
//        listaCuentas.add(cuenta);
//
//        System.out.println(cuenta);
//        System.out.println(cliente);



    }

    public static void imprimirMenu1(){

        System.out.println("MENÚ PRINCIPAL:");
        System.out.println("    [1] Mantenimiento de Clientes");
        System.out.println("    [2] Mantenimiento de Cuentas");
        System.out.println("    [3] Salir");

    }

    public static void eleccion1(){
        int eleccion = teclado.nextInt();
        teclado.nextLine();

        switch (eleccion){
            case 1:
                menuClientes();
                break;
            case 2:

                break;
            default:
                System.out.println("Saliendo...");
        }


    }

    public static void menuClientes(){
        System.out.println("CLIENTES:");
        System.out.println("    [1] Altas");
        System.out.println("    [2] Bajas");
        System.out.println("    [3] Modificaciones");
        System.out.println("    [4] Listados de clientes");
        System.out.println("    [5] Volver al menú principal");
        eleccionClientes();
    }

    public static void eleccionClientes(){
        int eleccion = teclado.nextInt();
        teclado.nextLine();

        switch (eleccion){
            case 1: //altas
                listaClientes.add(new Cliente());
                menuClientes();
                break;
            case 2: //bajas
                System.out.println("Escribe el nombre que quieres eliminar");
                String nombre = teclado.nextLine();

                for (Cuenta cuenta : listaCuentas){
                    if (cuenta.getTitular().getNombre().equals(nombre)){
                        cuenta.setTitular(null);
                    }
                }

                for (Cliente cliente : listaClientes){
                    if (cliente.getNombre().equals(nombre)){
                        listaClientes.remove(cliente);
                        System.out.println(nombre+" borrado.");
                    }else {
                        System.out.println("No hay clientes con nombre "+nombre);
                    }
                }

                main();
                break;



            case 3://modificaciones
                System.out.println("Listado de clientes ("+listaClientes.size()+"):");
                for (Cliente cliente:listaClientes){
                    System.out.println(cliente.getId()+". "+cliente.getNombre()+" "+cliente.getApellidos());
                }
                System.out.println("Que cliente quiere modificar?");
                int idCliente = teclado.nextInt();
                teclado.nextLine();

                for (Cliente cliente : listaClientes){
                    if (idCliente == cliente.getId()){
                        System.out.println("Modifica el nombre");
                        String nombreNuevo = teclado.nextLine();
                        cliente.cambioNombre(nombreNuevo);
                    }
                }

                main();

                break;
            case 4://Listado clientes

                System.out.println("Listado de clientes ("+listaClientes.size()+"):");
                for (Cliente cliente:listaClientes){
                    System.out.println(cliente.getId()+". "+cliente.getNombre()+" "+cliente.getApellidos());
                }
                main();
                break;

            default:
                main();


        }

    }




}





