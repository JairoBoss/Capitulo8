package GameZone4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecretPhrase2 a = new SecretPhrase2();

        a.descrubrirFrase();
        a.taparFrase();
        char x;
        do {
            System.out.println("Introduce la letra");
            x = sc.next().charAt(0);
            a.destaparFrase(x);
            System.out.println(a.getDescubir());
        }while (!a.completado());


    }
}
