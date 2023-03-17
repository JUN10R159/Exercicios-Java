package entities;

public class Product {
    public String nome;
    public double preço;
    public int quantidade;
    public double valor_estoque(){
        double valor = quantidade *preço;
        return valor;
    }
    public void adicionar_produto(int quantidade){
        this.quantidade += quantidade;
    }
    public void remover_produto(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){
        return (nome + ", Preço: " + String.format("%.2f" , preço) + ", quantidade em estoque: " + quantidade + ". Total: " +  String.format("%.2f" , valor_estoque())); 
    }

}
