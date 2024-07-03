import java.util.Scanner;

public class calificacion {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int calificacion;
            System.out.println("Ingresa una calificacion del 1 al 5:");
            calificacion = scanner.nextInt();

            switch (calificacion) {
                case 1:
                    System.out.println("Muy deficiente");
                    break;
                case 2:
                    System.out.println("Deficiente");
                    break;
                case 3:
                    System.out.println("Suficiente xd");
                    break;
                case 4:
                    System.out.println("Notable");
                    break;
                case 5:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("Calificacion no valida");
                    break;
            }
        }
    }
}
