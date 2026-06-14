import java.util.Scanner;

public class Ex011 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        double readerNumber = sc.nextDouble();
        if ((readerNumber >= 0) && (readerNumber < 25)) {

            System.out.println("Intervalo [0,25]");

        } else if ((readerNumber >= 25) && (readerNumber < 50)) {
            System.out.println("Intervalo [25,50]");

        } else if ((readerNumber >= 50) && (readerNumber < 75)) {
            System.out.println("Intervalo [50,75]");

        } else if ((readerNumber >= 75) && (readerNumber <= 100)) {
            System.out.println("Intervalo [75,100]");

        } else {
            System.out.println("Fora do intervalo!");

        }

        sc.close();
    }

}
