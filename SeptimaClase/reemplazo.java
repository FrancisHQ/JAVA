package SeptimaClase;

import java.util.Scanner;

public class reemplazo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.println("Ingresa la palabra que deseas reemplazar: ");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingresa la palabra por la que quieres reemplazarla: ");
        String palabra2 = scanner.nextLine();
        scanner.close();

        String reemplazo = frase.replace(palabra1, palabra2);
        System.out.println(reemplazo);
    }
}
