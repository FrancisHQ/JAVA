package SeptimaClase;

import java.util.Scanner;

public class quitarEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase con espacios al inicio y al final: ");
        String frase = scanner.nextLine();
        scanner.close();
        System.out.println("La longitud de la frase con espacios es: " + frase.length());
        String quitandoEspacios = frase.trim();

        System.out.println("La frase sin espacios al inicio y final es: " + quitandoEspacios);
        System.out.println("La longitud de la frase sin espacios es: " + quitandoEspacios.length());
    }
}
