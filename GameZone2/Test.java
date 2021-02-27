package GameZone2;

public class Test {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador pc = new Jugador();

        jugador1.lanzarLosDados();
        pc.lanzarLosDados();

        System.out.println("Los dados repetidos del jugador son: "+jugador1.contarRepetidos());
        System.out.println("Los dados repetidos de la pc son: " + pc.contarRepetidos());

        if (pc.contarRepetidos() > jugador1.contarRepetidos()){
            System.out.println("La pc gana");
        }else if(pc.contarRepetidos() < jugador1.contarRepetidos()){
            System.out.println("Jugador gana");
        }else{
            System.out.println("empate");
        }
        //jugador1.imprimir();
    }
}
