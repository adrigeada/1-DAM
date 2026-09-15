package org.example.practica2;


import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.Connection;
import java.time.LocalDate;

public class HelloController {

    static Connection bd;

    @FXML
    private Label actionLabel;

    @FXML
    private TableView<Estudiante> estudiantesTableView;

    @FXML
    private TableColumn<Estudiante,Integer> niaTableColumn;

    @FXML
    private TableColumn<Estudiante,String> nombreTableColumn;

    @FXML
    private TableColumn<Estudiante,LocalDate> fechaTableColumn;

    @FXML
    private TextField niaTextField;

    @FXML
    private TextField nombreTextField;

    @FXML
    private DatePicker fechaPicker;

    @FXML
    public void initialize(){
        niaTableColumn.setCellValueFactory(datos -> new SimpleIntegerProperty(datos.getValue().getNia()).asObject());
        nombreTableColumn.setCellValueFactory(datos -> new SimpleStringProperty(datos.getValue().getNombre()));
        fechaTableColumn.setCellValueFactory(datos -> new ReadOnlyObjectWrapper<>(datos.getValue().getFecha_nacimiento()));

        bd =  BaseDatos.conexion();

        estudiantesTableView.setItems(BaseDatos.consulta(bd));

        BaseDatos.desconectar(bd);
    }

    public void editarClickButton() {

    }

    public void eliminarClickButton() {
    }

    public void insertarButtonClick() {
        Integer nia = Integer.parseInt(niaTableColumn.getText());
        String nombre = nombreTextField.getText();
        LocalDate fecha = fechaPicker.getValue();
        Estudiante estudiante = new Estudiante(nia,nombre,fecha);

        BaseDatos.insertar(bd,estudiante);


    }

    public void guardarButtonClick() {

    }
}
