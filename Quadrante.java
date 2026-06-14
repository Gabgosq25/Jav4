import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = sc.nextDouble();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante!");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante!");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante!");
            } else {
                System.out.println("Quarto quadrante!");
            }
            System.out.print("Digite o valor de X: ");
            x = sc.nextDouble();
            System.out.print("Digite o valor de Y: ");
            y = sc.nextDouble();

        }
        System.out.println("Quadrante Nulo!");
        sc.close();
    }
}
