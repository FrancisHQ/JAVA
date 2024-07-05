package SeptimaClase;

import java.util.Scanner;

public class busqueda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.println("Ingresa un caracter a buscar: ");
        String caracter = scanner.nextLine();
        scanner.close();
        int busqueda = frase.indexOf(caracter);
        System.out.println("El caracter se encuentra en la posicion: " + busqueda);

    }
}
