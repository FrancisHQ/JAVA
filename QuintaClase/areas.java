import java.util.InputMismatchException;
import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "Seleccione una opción para calcular el área: \nOpción 1: Círculo \nOpción 2: Cuadrado \nOpción 3: Triángulo ");

            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa el radio del círculo: ");
                        double radio = scanner.nextDouble();
                        double area = Math.PI * Math.pow(radio, 2);
                        System.out.println("El área del círculo es: " + area);
                        break;
                    case 2:
                        System.out.println("Ingresa el lado del cuadrado:");
                        double lado = scanner.nextDouble();
                        double areaCuadrado = Math.pow(lado, 2);
                        System.out.println("El área del cuadrado es: " + areaCuadrado);
                        break;
                    case 3:
                        System.out.println("Ingresa el lado del triángulo:");
                        double base = scanner.nextDouble();
                        System.out.println("Ingresa la altura del triángulo:");
                        double height = scanner.nextDouble();
                        double areaTriangulo = (base * height) / 2;
                        System.out.println("El área del triángulo es: " + areaTriangulo);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida");
            }
        }
    }
}
