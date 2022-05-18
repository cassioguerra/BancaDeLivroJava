package Entidade;

public class doce extends produto {

    // construtor tem o mesmo nome da class

    private String marca;


    public doce(int codigo, String name, String marca) {
        super(codigo, name);
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
