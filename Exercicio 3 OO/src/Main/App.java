package Main;

import java.util.Scanner;
import java.util.Locale;
import Entities.Alunos;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Alunos alunos = new Alunos();

        System.out.println("Digite o nome do aluno e suas 3 notas: ");
        alunos.nome = sc.next();
        alunos.nota1 = sc.nextDouble();
        alunos.nota2 = sc.nextDouble();
        alunos.nota3 = sc.nextDouble();

        /*System.out.println("\n" + alunos.notaFinal() + "\n");*/


        System.out.println("\nNome: " + alunos.nome + "\nNota final: " + alunos.notaFinal() + "\nStatus: " + alunos.verificacao());
        if (alunos.verificacao() == "Reprovado") {
            System.out.println("Faltaram " + alunos.notaFalta() + " pontos para passar");
        }
        sc.close();
    }
}