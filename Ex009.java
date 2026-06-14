import java.util.Locale;
import java.util.Scanner;


public class Ex009 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double A = sc.nextDouble();
        System.out.println("Digite outro número: ");
        double B = sc.nextDouble();

        if((A % B == 0) || (B % A == 0)) {
            System.out.println(" Os números digitados são multiplos entre si! ");

        }
        else{
            System.out.println("Os número digitados não são multiplos entre si!");
        }

        sc.close();
    }
    
}
