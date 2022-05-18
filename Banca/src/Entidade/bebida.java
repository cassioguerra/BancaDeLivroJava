package Entidade;

public class bebida extends produto {

    // construtor tem o mesmo nome da class

    private String tipo;

    public bebida(int codigo, String name, String tipo) {
        super(codigo, name);
        this.tipo =tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
