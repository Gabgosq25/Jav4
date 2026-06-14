import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual foi a hora inicial do jogo? ");
        int horainicial = sc.nextInt();
        System.out.println("Qual foi a hora final do jogo? ");
        int horafinal = sc.nextInt();
        int duracao;

        if (horainicial < horafinal) {
            duracao = horafinal - horainicial;
            System.out.println("O jogo teve duração de " + duracao + "Horas!");

        }

        else {

            duracao = 24 - horainicial + horafinal;
            System.out.println("O jogo teve duração de " + duracao + "Horas!");

        }
        sc.close();
    }

}
