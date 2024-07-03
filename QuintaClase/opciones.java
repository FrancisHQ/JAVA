import java.util.InputMismatchException;
import java.util.Scanner;

public class opciones {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Opción 1: Guardar \nOpción 2: Cargar \nOpción 3: Salir \nElige una opción: ");
            
            try {
                int opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Guardado correctamente");
                        break;
                    case 2:
                        System.out.println("Cargando...");
                        break;
                    case 3:
                        System.out.println("Has salido del menú con éxito");
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
