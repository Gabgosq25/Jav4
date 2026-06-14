import java.util.Scanner;

public class Leitordesenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 2002;
        System.out.println("Digite a senha: ");
        int digito = sc.nextInt();
        while (digito != password) {
            System.out.println("Senha Incorreta! Digite novamente:");
            digito = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");
        sc.close();
    }
}
