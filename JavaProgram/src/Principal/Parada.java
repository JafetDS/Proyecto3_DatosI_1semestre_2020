package Principal;

public class Parada {
    private String nombre, referencia;

    public Parada(String nombre, String referencia){
        this.nombre = nombre;
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReferencia() {
        return referencia;
    }
}
