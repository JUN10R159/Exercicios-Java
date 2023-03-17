package Entities;

public class Alunos {
    public String nome, status;
    public double nota1, nota2, nota3;
    
    public double notaFinal(){
         return (nota1 + nota2 + nota3);
        
    }
    public double notaFalta(){
        return 60 - notaFinal();
    }
    public String verificacao(){
        if (notaFinal() < 60 & notaFinal() >= 0) {
            return "Reprovado";
        } else if (notaFinal() >= 60 & notaFinal() <= 100) {
            return "Aprovado";
        } else {
            return "Nota inválida";
        }
    }
}
