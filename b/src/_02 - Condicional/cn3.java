import java.util.Scanner;

public class cn3 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);    
    System.out.println("Digite dois números: ");
    int A = sc.nextInt();
    int B = sc.nextInt();
    String resultado;
    if (A % B == 0 || B % A == 0) {
        resultado = "Multiplo";
        System.out.println(resultado);
    }
    else {
        resultado = "Não Multiplo";
        System.out.println(resultado);
    }
    sc.close();
    }
}