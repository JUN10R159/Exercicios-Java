import java.util.Scanner;

public class cn2 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);    
    System.out.println("Digite um número: ");
    int A = sc.nextInt();
    String resultado;
    if (A % 2 == 0){
        resultado = "Par";
        System.out.println(resultado);
    }
    else {
        resultado = "Impar";
        System.out.println(resultado);
    }
    sc.close();
    }
}
