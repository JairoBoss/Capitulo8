package GameZone2;

public class Die {
    private Integer numero;

    public Die(){
        lanzar();
    }

    public void lanzar(){
        this.numero = (int)(Math.random()*6+1);
    }

    @Override
    public String toString() {
        return "Die{" +
                "numero=" + numero +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
