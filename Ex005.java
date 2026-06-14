import java.util.Scanner;
import java.util.Locale;

public class Ex005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = sc.next();
        System.out.println("Quantas horas esse funcionário trabalhou? ");
        double horastrabalhadas = sc.nextDouble();
        System.out.println("Qual o valor da hora trabalhada deste funcionário? ");
        double valorhora = sc.nextDouble();
        double salario = horastrabalhadas*valorhora;
        System.out.printf("O funcionário %s receberá R$ %.2f%n ", nome, salario);



        sc.close();

    }

    
}