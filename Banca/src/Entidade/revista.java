package Entidade;

public class revista extends produto{

   // construtor tem o mesmo nome da class

    private  String editora;



    public revista(int codigo, String name, String editora) {
        super(codigo, name);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

}
