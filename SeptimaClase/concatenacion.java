package SeptimaClase;
import java.util.Scanner;
public class concatenacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tus nombres: ");
        String nombres = scanner.nextLine();

        System.out.println("Ingresa tus apellidos:");
        String apellidos = scanner.nextLine();

        String concatenacion = nombres.concat(" " + apellidos);
        scanner.close();
        System.out.println("Tu nombre completo es: " + concatenacion);
    }
}
