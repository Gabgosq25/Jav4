import java.util.Scanner;
import java.util.Locale;

public class Ex004 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = sc.nextDouble();
        System.out.println("Digite o valor de D: ");
        double D = sc.nextDouble();
        double dif = (A*B-C*D);
        System.out.println("O valor da diferença do produto de A e B com o produto de C e D é =" + dif);
        sc.close();


    }

    
}