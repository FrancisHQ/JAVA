package SeptimaClase;

import java.util.Scanner;

public class extraccionCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.println("Ingresa la posición donde inicia la extracción: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa la posición donde termina la extracción: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        String extraccion = frase.substring(num1, num2);
        System.out.println("La extracción es: " + extraccion);

        scanner.close();
    }
}
