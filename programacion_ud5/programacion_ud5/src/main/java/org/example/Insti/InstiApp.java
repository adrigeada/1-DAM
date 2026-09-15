package org.example.Insti;

public class InstiApp {
    static void main() {

       Instituto mutxa = new Instituto("Ies Mutxamel","San Vicent");

        Curso java = new Curso("Java", 100);
        Curso python = new Curso("Pyhon", 70);
        Curso copia = new Curso("Pyhon",10);

        mutxa.insertarCurso(java);
        mutxa.insertarCurso(python);

        try {
            Estudiante estudiante1 = new Estudiante("Carlos", 20, java);
            Estudiante estudiante2 = new Estudiante("Ana", 22, python);
            mutxa.insertarEstudiante(estudiante1);
            mutxa.insertarEstudiante(estudiante2);
            Estudiante estudiante3 = new Estudiante(null);

        }catch (NullPointerException e){
            System.out.println("Error. No se puede crear un estudiante sin nombre");
        }

        mutxa.insertarEstudiante(null);
        mutxa.insertarCurso(null);

        System.out.println("Cursos disponibles");
        System.out.println(mutxa.getListaCursos());

        System.out.println("Estudiantes matriculados");
        System.out.println(mutxa.getListaEstudiantes());

        mutxa.insertarCurso(copia);


    }
}
