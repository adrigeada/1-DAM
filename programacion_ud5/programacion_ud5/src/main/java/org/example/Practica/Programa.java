package org.example.Practica;

import java.util.ArrayList;

public class Programa {
    private static final String CARGO_DIRECTOR = "director";

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre,Cadena cadena,String nombre_director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        setDirector(nombre_director);
        cadena.anyadirPrograma(this); //Cuando se crea el programa se añade a si mismo a su cadena.
    }


    //------------------------------------------------

    /*
    Este método crea empleados dentro de un programa. Si el cargo de este es director, no lo deja crear, porque el director se crea en Programa. Luego se añaden a la lista de empleados.
     */
    public void anyadirEmpleado(String nombre, String cargo){
        Empleado empleado = new Empleado(nombre,cargo,getDirector());
        if (cargo.equals(CARGO_DIRECTOR)){
            System.out.println("El programa ya tiene director.");
            return;
        }

        listaEmpleados.add(empleado);
    }

    public void borrarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

   /*
   Este método crea invitados y los añade a la lista de invitados
    */
    public void anyadirInvitado(String nombre,String profesion,int temporada){
        Invitado invitado = new Invitado(nombre,profesion,temporada);
        listaInvitados.add(invitado);
    }

    public void borrarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }

    /*
    Dada una temporada, este metodo cuenta cuantos invitados han asistido a esta temporada y los enseña
     */
    public void invitadosTemporada(int temporada){
        int contador = 0;

        for (Invitado invitado : listaInvitados){
            if (invitado.getTemporada() == temporada){
                contador++;
                System.out.println("El invitado "+invitado.getNombre()+ " que es "+invitado.getProfesion()+" fue en la temporada "+temporada);
            }
        }

        System.out.println(contador+" Invitados han ido en la temporada "+temporada );

    }

    /*
    Dado un nombre de un invitado, este método cuenta cuantas veces ha estado este invitado en un programa. Lo devuelve en un int.
     */
    public int vecesInvitado(String nombre){
        int contador = 0;

        for (Invitado invitado : listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                contador++;
            }
        }
        return contador;
    }

    /*
    Dado el nombre de un invitado, este método enseña que días estuvo en el programa
     */
    public void rastrearInvitado(String nombre){
        int veces = vecesInvitado(nombre);
        System.out.println("El invitado "+nombre+" ha ido "+veces+" veces al programa "+this.nombre);

        for (Invitado invitado : listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                System.out.println("- El día "+invitado.getFechaVisita()+", en la temporada "+invitado.getTemporada());
            }

        }
    }

    /*
    Dado un nombre de un invitado, este método comprueba si el invitado ha ido al programa. Devuelve un booleano
     */
    public boolean buscarInvitado(String nombre){
        for (Invitado invitado : listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }


    //--------------------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    /*
    Cuando se crea el programa, se crea tambien el director que es un empleado que siempre va a tener el cargo "director", por eso se una CARGO_DIRECTOR
     */
    public void setDirector(String nombre) {
        Empleado director = new Empleado(nombre,CARGO_DIRECTOR,null);
        this.director = director;
        listaEmpleados.add(director);
    }

    // -------------------------------------------------------------


    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas +
                ", director=" + director +
                ", Lista empleados= " + listaEmpleados +
                '}';
    }
}
