package SextaClase;
import java.util.InputMismatchException;
import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        try {

            try {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese el primer número: ");

                int num1 = scanner.nextInt();

                System.out.print("Ingrese el segundo número: ");

                int num2 = scanner.nextInt();

                double resultado = num1 / num2;

                System.out.println("El resultado es: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("La división por cero no es posible.");

            }

        } catch (InputMismatchException e) {
            System.out.println("xd.");

        }
    }
}
