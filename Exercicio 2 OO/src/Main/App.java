package Main;
import Entities.Funcionario;
import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("digite o nome, salario bruto e taxa: ");

        funcionario.nome = sc.next();
        funcionario.salarioBruto = sc.nextDouble();
        funcionario.taxa = sc.nextDouble();
        System.out.println();
        System.out.println(funcionario);

        System.out.println();
        System.out.println("Digite a porcentagem de aumento: ");

        double porcentagem = sc.nextDouble();
        funcionario.aumentoSalarial(porcentagem);
        System.out.println();
        System.out.println("aumento: " + funcionario);

        sc.close();
    }
}
