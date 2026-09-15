package org.example.Biblioteca;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private static final String CADENA_ID = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;


    public Libro(String titulo, String autor, Editorial editorial){
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        id=calcularID();
        estudiantePrestado = null;
        this.editorial = editorial;                            //empieza nulo, lo pide en el ejercicio. Cuando se le presta un libro a un estudiante, estudiante prestado pasa a ser el estudiante que le han pasado al metodo prestar
        editorial.insertarLibro(this); //cada vez que se construye un libro, al que se le da una editorial, este se añade a la lista de libros de la editorial
    }

    private static String calcularID(){
       return CADENA_ID + cantidadLibros;
    }

    public Prestamo prestar(Estudiante estudiante){

        Prestamo prestamo = null;

        if (disponible && !estudiante.getListaLibros().contains(this)) {
            disponible = false;
            System.out.println("El libro " + titulo + " ha sido prestado con éxito a " + estudiante.getNombre());
            librosDisponibles--;
            estudiantePrestado = estudiante; //estudiante ahora es el estudiante que le has pasado desde el main al metodo prestar
            estudiante.insertarLibro(this); //el atributo libro de estudiante ahora es this (el objeto en el que estamos)
            prestamo = new Prestamo(this,estudiante);
            System.out.println("Prestamo realizado");
        } else if (estudiante.getListaLibros().contains(this)) {
            System.out.println("El estudiante "+ estudiante.getNombre() + " ya tiene el libro "+  titulo +" prestado.");

    }else {
            System.out.println("El libro " + titulo+" no está disponible");
        }

        return prestamo;
    }

    public void devolver(){
        if (!disponible){
            disponible = true;
            librosDisponibles++;
            System.out.println("El libro ha sido devuelto con éxito por "+estudiantePrestado.getNombre());
            estudiantePrestado.borrarLibro(this);
            estudiantePrestado = null;
        }else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    public boolean estaDisponible(){
        return disponible;
    }

    public static int getTotalLibros(){ //los metodos estaticos no usan atributos y se usan para toda la clase, se llaman con Libro no con nombre del libro
        return cantidadLibros;
    }

    public static int getLibrosDisponibles(){
        return librosDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }


//    public void setId(String id) {
//        this.id = id;
//    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                ", estudiante=" + estudiantePrestado+
                ", editorial= " + editorial+
                '}';
    }
}
