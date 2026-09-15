package org.example.Insti;

import lombok.*;

import java.util.Objects;

@Getter @Setter @ToString
@NoArgsConstructor //constructor vacio
@AllArgsConstructor //constructor con los atributos
@RequiredArgsConstructor //constructor con los atributos que tengan el non null (nombre)
@Data //genera getter setter to string y el requiredConstructor
public class Apuntes {

    @NonNull //non null en el constructor
    private String nombre;
    private String poblacion;

    public void setNombre( String nombre){ //non null en el setter
        this.nombre = Objects.requireNonNullElse(nombre,"IES COMODIN");
    }

}
