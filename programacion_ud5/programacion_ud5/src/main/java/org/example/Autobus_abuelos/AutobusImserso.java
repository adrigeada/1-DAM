package org.example.Autobus_abuelos;

import java.util.ArrayList;

public class AutobusImserso {

    private ArrayList<Abuelo> listaAbuelos;
    private String matricula;
    private String destino;


    public AutobusImserso(String matricula, String destino){
        this.matricula = matricula;
        this.destino = destino;
        listaAbuelos = new ArrayList<>(); //Inicializar lista en el constructor

    }

    public void insertarAbuelo(Abuelo abuelo){
        listaAbuelos.add(abuelo);
    }

    public void borrarAbuelo(Abuelo abuelo){
        listaAbuelos.remove(abuelo);
    }

    public void mostrarAbuelo(){

        System.out.println("Abuelos del autobus con matricula"+ matricula+ ": " );

        for (Abuelo abuelo : listaAbuelos){
            System.out.println("- "+ abuelo.getNombre()+ " de " + abuelo.getEdad()+ " años");
        }

    }

    public void mostrarMayores(int edad){

        System.out.println("Abuelos mayores a " + edad+ " años: ");

        for (Abuelo abuelo : listaAbuelos){
            if (abuelo.getEdad() >= edad){
                System.out.println("- "+ abuelo.getNombre()+ " de " + abuelo.getEdad()+ " años");
            }

        }

    }

    public ArrayList<Abuelo> getListaAbuelos() {
        return listaAbuelos;
    }

    public void setListaAbuelos(ArrayList<Abuelo> listaAbuelos) {
        this.listaAbuelos = listaAbuelos;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "AutobusImserso{" +
                "listaAbuelos=" + listaAbuelos +
                ", matricula='" + matricula + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}

