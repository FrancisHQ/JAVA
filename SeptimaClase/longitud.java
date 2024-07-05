package SeptimaClase;
import java.util.Scanner;

public class longitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        scanner.close();
        System.out.println("La longitud de la cadena es: " + cadena.length());
        
    }
}
