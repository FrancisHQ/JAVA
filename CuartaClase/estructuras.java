import java.util.Scanner;

public class estructuras {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;

            System.out.print("Ingrese un número entre 0 y 100: ");

            numero = scanner.nextInt();

            if(numero >= 90 && numero <= 100) {
                System.out.println("A");
            } else if(numero >= 80 && numero < 90) {
                System.out.println("B");
            } else if(numero >= 70 && numero < 80) {
                System.out.println("C");
            } else if(numero >= 60 && numero < 70) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }

    }
}