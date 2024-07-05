package SextaClase;
import java.util.Scanner;

public class conversionCadenaTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese una cadena a entero: ");
            String convertido = scanner.nextLine();
            int numero = Integer.parseInt(convertido);
            System.out.println("El número convertido es: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no es un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}
