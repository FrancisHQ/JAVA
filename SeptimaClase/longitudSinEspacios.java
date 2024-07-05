package SeptimaClase;

import java.util.Scanner;

public class longitudSinEspacios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        scanner.close();

        int sinContarEspacios = frase.replaceAll(" ", "").trim().length();

        System.out.println("La frase ingresada sin espacio es: " + frase.replaceAll(" ", "").trim());
        System.out.println("La longitud de la frase con espacios es: " + frase.length());
        System.out.println("La longitud de la frase sin espacios es: " + sinContarEspacios);
    }
}
