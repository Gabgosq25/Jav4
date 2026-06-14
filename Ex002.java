import java.util.Scanner;
import java.util.Locale;

public class Ex002 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();
        double soma = valor1 + valor2;

        System.out.println("Valor calculado na soma de 1 e 2 = " + soma);

        sc.close();


    }

    
}
