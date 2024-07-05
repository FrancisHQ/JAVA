package SextaClase;
import java.util.Scanner;

public class resta {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el primer número: ");
    
            int num1 = scanner.nextInt();
    
            System.out.print("Ingrese el segundo número: ");
    
            int num2 = scanner.nextInt();
    
            int resta = num1 - num2;

            System.out.println("La resta es: " + resta);
        }
        catch (Exception e) {
            System.out.println("No se ingresó el valor");
        }

        


    }
}
