package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("insira os dados:");
        System.out.print("nome: ");
        product.nome = sc.next();

        System.out.print("preço: ");
        product.preço = sc.nextDouble();

        System.out.print("quantidade: ");
        product.quantidade = sc.nextInt();
    
        System.out.println(product);

        System.out.println();
        System.out.println("digite a quantidade a ser adicionada: ");
        int quantidade = sc.nextInt();
        product.adicionar_produto(quantidade);

        System.out.println();
        System.out.println("Atualização: " + product);

        System.out.println();
        System.out.println("digite a quantidade a ser removida: ");
        quantidade = sc.nextInt();
        product.remover_produto(quantidade);
        System.out.println("Atualização: " + product);

     sc.close();   
    }
}
