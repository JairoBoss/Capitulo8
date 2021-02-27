package GameZone1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pregunta {
    private ArrayList<Respuesta> respuestas;
    private String pregunta;
    private Scanner sc = new Scanner(System.in);

    public Pregunta(){
        System.out.println("Introduce tu pregunta");
        this.pregunta = sc.nextLine();
        respuestas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la respuesta e indica con 1 si es correcta o con 2 si es incorrecta");
            char xz = 'a';
            if (i == 1){
                xz = 'b';
            }else if (i ==2){
                xz = 'c';
            }
            String x =  sc.nextLine();
            int q = sc.nextInt();
            boolean y;
            if (q == 1){
                y = true;
            }else{
                y = false;
            }
            Respuesta aux = new Respuesta(x,y,xz);
            respuestas.add(aux);
        }
    }
    
    public void imprimir(){
        System.out.println(this.pregunta);
        for (int i = 0; i < respuestas.size(); i++) {
            System.out.println(respuestas.get(i));
        }
    }

    public boolean checar(char a){
        return respuestas.get(a).getPuntaje() == true ? true : false;
    }
}
