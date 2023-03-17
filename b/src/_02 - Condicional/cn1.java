import java.util.Scanner;
public class cn1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Digite o numero: ");
        a = sc.nextInt();
        if (a < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("positivo");
        }      
        sc.close();
    }   
}