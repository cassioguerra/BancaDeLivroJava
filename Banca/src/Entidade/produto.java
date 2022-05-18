package Entidade;

public abstract class produto {

    private int codigo ;
    private String nome ;
    private int estoque;
    private double valorUnitario;

    // criando um construtor
     public  produto (int codigo , String name ){

         this.codigo = codigo;
         this.nome = name;
     }
 public  int getCodigo(){
     return codigo;
 }
 public void setCodigo( int codigo){
         this.codigo = codigo;
 }
 public String getNome(){
         return nome;
    }
    public void setNome( String nome){
        this.nome = nome;
    }

 public  int getEstoque(){
     return estoque;
 }
/* meu estoque não podera ser mechido a qualquer tem po
po isso meu set estoque esta sendo retirado. só com metodos
 public  void setEstoque( int estoque){
         this.estoque = estoque;
 }*/
 public  double getValorUnitario(){
     return valorUnitario;
 }
 public void setValorUnitario(double valorUnitario){
         this.valorUnitario= valorUnitario;
 }

 // metodos
    // incluir no estoque
    public void incluirEstoque( int quantidade ){
     estoque = estoque + quantidade;
    }
// retirar do estoque
public void tirarEstoque( int quantidade ){
     if (quantidade <= estoque) {
         estoque = estoque - quantidade;
     } else {
         System.out.println(" estoque indisponivel ");
     }
}

}

