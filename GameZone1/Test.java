package GameZone1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pregunta pregunta = new Pregunta();
        //pregunta.imprimir();
        System.out.println("Introduce tu respuesta");
        char x = sc.next().charAt(0);
        pregunta.checar(x);
    }
}
