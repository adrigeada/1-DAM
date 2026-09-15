package org.example.Insti;

import lombok.*;

import java.util.Objects;

@Getter@Setter@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;


}
