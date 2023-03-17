import java.util.Locale;

public class ex1 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    String product1 = "Computer";
    String product2 = "Office Desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100;
    double price2 = 650.50;
    double measure = 53.234567;
    
    System.out.println(product1 + ", which price is: $" + price1 );
    System.out.println(product2 + ", which price is: $" + price2);
    System.out.println("Record: " + age + " years old" + ", code: " + code + " and gender: " + gender);
    System.out.printf("%.8f%n", measure);
    System.out.printf("%.3f%n", measure);
    }
}
