import java.util.Scanner;

public class PrimeraActividad {
    public static void main(String[] args) {

        // Nombre y Edad

        try (Scanner scanner = new Scanner(System.in)) {
            String nombreCompleto = "";
            int edad;
            System.out.print("Ingrese su nombre: ");
            nombreCompleto = scanner.nextLine();
            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();
            System.out.println("Su nombre es: " + nombreCompleto + " y su edad es: " + edad);
        }
       
    }
}
