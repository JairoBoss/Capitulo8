package GameZone1;

import java.util.ArrayList;

public class Cuestionario {
    private ArrayList<Pregunta> preguntas;
    private Integer puntaje;

    public Cuestionario(){
        preguntas = new ArrayList<>(4);
        this.puntaje = 0;
    }

}
