package SeptimaClase;

import java.util.Scanner;

public class mayusculasMinusculas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        System.out.println("La frase en mayúsculas es: " + mayusculas);
        System.out.println("La frase en minúsculas es: " + minusculas);
    }
}
