import java.util.Scanner;
import java.util.Locale;


public class Ex008 {
public static void main(String[] args) { 
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    double number = sc.nextDouble();
    
    if (Math.abs(number % 2) == 0) {
       System.out.println("O número: " + number + " é par!");
    }

    else{
        System.out.println("O número: " + number + " é impar!");
    }

}
   
}
