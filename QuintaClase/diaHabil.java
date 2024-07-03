import java.util.InputMismatchException;
import java.util.Scanner;

public class diaHabil {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int dia;
            System.out.println("Ingresa un numero del 1 al 7: ");

            try {
                dia = scanner.nextInt();

                switch (dia) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Es día hábil");
                        break;
                    case 6:
                    case 7:
                        System.out.println("No es día hábil");
                        break;
                    default:
                        System.out.println("Número no valido");
                        break;  
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion no valida");
            }

        }
    }
}
