import java.util.Scanner;

public class SegundaActividad {
    public static void main(String[] args) {

        // Suma, Resta, Multiplicación, División, Módulo
        
        try (Scanner scanner = new Scanner(System.in)) {
            int n1;
            System.out.print("Ingrese el primer número: ");
            n1 = scanner.nextInt();
            int n2;
            System.out.print("Ingrese el segundo número: ");
            n2 = scanner.nextInt();
            int suma = n1 + n2;
            int resta = n1 - n2;
            int multiplicacion = n1 * n2;
            double division = n1 / n2;
            int modulo = n1 % n2;
            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multiplicación es: " + multiplicacion);
            System.out.println("La división es: " + division);
            System.out.println("El módulo es: " + modulo);
        }
    }
}