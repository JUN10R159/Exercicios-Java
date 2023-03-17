import java.util.Scanner;
public class er1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha:");
        int senha = sc.nextInt();
        while(senha != 2002){
            System.out.println("Acesso negado");
            System.out.println("Digite a senha:");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
