import java.util.Scanner;

public class divisibilidad {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int numero;

            System.out.print("Ingrese un número: ");

            numero = scanner.nextInt();

            if(numero % 5 == 0 && numero % 3 == 0) {
                System.out.println("Es divisible por 5 y 3");
            } else if (numero % 5 == 0) {
                System.out.println("Divisible por 5");
            } else if (numero % 3 == 0) {
                System.out.println("Divisible por 3");
            } else {
                System.out.println("No es divisible");
            }
        }
    }
}
