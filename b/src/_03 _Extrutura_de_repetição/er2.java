import java.util.Scanner;
public class er2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite um combustivel");
        int combustivel = sc.nextInt();
        
        while (combustivel != 4){
            System.out.println("Digite um combustivel");
            combustivel = sc.nextInt();
            if (combustivel == 1){
                alcool++;
            }
            else if (combustivel == 2){
                gasolina++;
            }
            else if (combustivel == 3){
                diesel++;
            }
            else{
                System.out.println("Código inválido:");
            }
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("gasolina: " + gasolina);
        System.out.println("diesel: " + diesel);
        sc.close();
    }
}
