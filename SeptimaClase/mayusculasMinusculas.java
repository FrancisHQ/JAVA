package SeptimaClase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mayusculasMinusculas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.println("¿Desea en mayusculas o minusculas?: \n1.Mayusculas\n2.Minusculas");
        
        try {
            int value = scanner.nextInt();
            scanner.close();

            switch (value) {
                case 1:
                    String mayusculas = frase.toUpperCase();
                    System.out.println("La frase en mayúsculas es: " + mayusculas);
                    break;
                case 2:
                    String minusculas = frase.toLowerCase();
                    System.out.println("La frase en minúsculas es: " + minusculas);
                    break;
                default:
                    System.out.println("La opción seleccionada es invalida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("La opción seleccionada es invalida.");
        }
    }
}
