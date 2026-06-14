import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.next();

        System.out.println("Qual a nota de " + nome + " no primeiro semestre?");
        double nota1 = sc.nextDouble();
        System.out.println("Qual a nota de " + nome + " no segundo semestre?");
        double nota2 = sc.nextDouble();

        double notafinal = (nota1 + nota2) / 2;
        if (notafinal >= 60.0) {

            System.out.printf("O aluno %s foi aprovado com média %.1f%n", nome, notafinal);
        } else {

            System.out.printf("O aluno %s foi reprovado com média %.1f%n", nome, notafinal);
        }
        sc.close();
    }

}
