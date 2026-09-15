package org.example.practica2;

import javafx.collections.ObservableList;

import java.sql.*;
import java.time.LocalDate;

public class BaseDatos {
    static ObservableList<Estudiante> listaEstudiantes;

    public static Connection conexion() {
        Connection conexion;
        String host = "jdbc:mariadb://localhost:3310/";
        String user = "root";
        String psw = "";
        String bd = "instituto";
        System.out.println("Conectando...");

        try {
            conexion = DriverManager.getConnection(host+bd,user,psw);
            System.out.println("Conexión realizada con éxito.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return conexion;
    }

    public static void desconectar(Connection conexion){

        System.out.println("Desconectando...");

        try {
            conexion.close();
            System.out.println("Conexión finalizada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void insertar(Connection conexion,Estudiante estudiante){
        Integer nia = estudiante.getNia();
        String nombre = estudiante.getNombre();
        LocalDate fecha = estudiante.getFecha_nacimiento();


        String query = "INSERT INTO ESTUDIANTE (nia,nombre,fecha_nacimiento) VALUES ('"+nia+"','"+nombre+"','"+fecha+"')";

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query);
        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
    }

    public static ObservableList<Estudiante> consulta(Connection conexion){
        String query = "SELECT * FROM estudiante";

        Statement stmt;
        ResultSet respuesta;

        try{

            stmt = conexion.createStatement();
            respuesta = stmt.executeQuery(query);

            while(respuesta.next()){
                int nia = respuesta.getInt("nia");
                String nombre = respuesta.getString("nombre");
                LocalDate fecha_nacimiento = respuesta.getDate("fecha_nacimiento").toLocalDate();
                listaEstudiantes.add(new Estudiante(nia,nombre,fecha_nacimiento));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw  new RuntimeException();
        }


        return listaEstudiantes;
    }


}
