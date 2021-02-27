package GameZone1;

public class Respuesta {
    private String respuesta;
    private  Boolean puntaje;
    private char inciso;

    public Respuesta(String respuesta, Boolean puntaje, char numero) {
        this.respuesta = respuesta;
        this.puntaje = puntaje;
        this.inciso = numero;
    }

    public Respuesta(String x, boolean y) {
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "respuesta='" + respuesta + '\'' +
                ", puntaje=" + puntaje +
                ", numero=" + inciso +
                '}';
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Boolean getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Boolean puntaje) {
        this.puntaje = puntaje;
    }

    public char getNumero() {
        return inciso;
    }

    public void setNumero(char numero) {
        this.inciso = numero;
    }
}
