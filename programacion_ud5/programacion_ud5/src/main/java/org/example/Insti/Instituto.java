package org.example.Insti;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

@Getter@Setter@ToString
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Curso> listaCursos;

    public Instituto(String nombre,String poblacion){
        this.nombre = Objects.requireNonNullElse(nombre,"Instituto sin nombre");
        this.poblacion = poblacion;
        listaCursos = new ArrayList<>();
        listaEstudiantes  = new ArrayList<>();
    }

    public void insertarEstudiante(Estudiante estudiante){
        if (estudiante == null){
            System.out.println("No se puede añadir un estudiante nulo");
            return;
        }
        listaEstudiantes.add(estudiante);
    }

    public void insertarCurso(Curso curso){
        if (curso == null){
            System.out.println("No se pueden añadir cursos null");
            return;
        }

        for (int i = 0; i < listaCursos.size(); i++) {
            if (curso.getNombre().equals(listaCursos.get(i).getNombre()) || listaCursos.get(i).getHoras() == curso.getHoras()){
                System.out.println("No se pueden añadir cursos repetidos");
                return;
            }
        }
        listaCursos.add(curso);
    }

}
