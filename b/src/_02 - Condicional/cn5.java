import java.util.Scanner;

public class cn5 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);    
    System.out.println("Digite o código: ");
    int codigo = sc.nextInt();
    System.out.println("Digite a quantidade: ");
    double quantidade = sc.nextInt();
    double valor;
    if(codigo == 1 ){
        valor = 4 * quantidade;
        System.out.println("O valor foi de: R$" + valor);
    }
    else if(codigo == 2){
        valor = 4.5 * quantidade;
        System.out.println("O valor foi de: R$" + valor);
    }
    else if(codigo == 3){
        valor = 5 * quantidade;
        System.out.println("O valor foi de: R$" + valor);
    sc.close();
    }
    else if(codigo == 4){
        valor = 2 * quantidade;
        System.out.println("O valor foi de: R$" + valor);
    }
    else if(codigo == 5){
        valor = 1.5 * quantidade;
        System.out.println("O valor foi de: R$" + valor);
    }
    }
}