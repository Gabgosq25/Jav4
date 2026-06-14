import java.util.Locale;
import java.util.Scanner;

public class Ex012 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite seu salário: ");
        double money = sc.nextDouble();
        if (money >= 0.00 && money <= 2000.00) {
            System.out.println("Isento");
        } else if (money > 2000.01 && money <= 3000.00) {
            System.out.println("Sua taxa tributária será de aproximadamente 8%");
        } else if (money > 3000.01 && money <= 4500.00) {
            System.out.println("Sua taxa tributária será de aproximadamente 18%");
        } else {

            System.out.println("Sua taxa tributária será de aproximadamente 28%");
        }

        sc.close();
    }
    
}
