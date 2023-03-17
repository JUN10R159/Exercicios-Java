import java.util.Scanner;
public class cn6 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Digite seu salário: ");
    double renda = sc.nextDouble();
    double resultado1 = (renda-2000) *0.08;
    double resultado2 = ((renda - 3000) *0.18) + 1000.0 * 0.08;;
    double resultado3 = ((renda - 4500) *0.28) + 1500.0 * 0.18 + 1000.0 * 0.08;
    if (renda <= 2000 ){
        System.out.println("Isento");
    }
    else if (2000 < renda & renda <= 3000){
        System.out.println("R$"+ resultado1);
    }
    else if (renda > 3000 & renda <= 4500){
        System.out.println("R$"+ resultado2);
    }
    else if (renda > 4500){
        System.out.println("R$"+ resultado3);
    }
    sc.close();
    }
}