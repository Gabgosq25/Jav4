import java.util.Scanner;
import java.util.Locale;

public class Ex003 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o valor do raio: ");
        double raio = sc.nextDouble();
        double PI = 3.14159;
        double raio2 = Math.pow(raio, 2.0);
        double area = PI*raio2;

        System.out.printf("A área calculada é de: %.4f%n", area);
        

        sc.close();


    }

    
}