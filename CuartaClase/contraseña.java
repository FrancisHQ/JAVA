import java.util.Scanner;

public class contraseña {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String contraseña = "Francisxd24";
            String verificar;

            System.out.print("Ingresa la contraseña: ");
            verificar = scanner.next();
            if(contraseña.equals(verificar)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
            }
        }
    }   
}