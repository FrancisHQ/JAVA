import java.util.Scanner;

public class edades {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int edad;

            System.out.println("Ingresa tu edad: ");
            edad = scanner.nextInt();

            if(edad < 18 && edad >= 0) {
                if (edad <= 4) {
                    System.out.println("Eres menor de edad y pequeño infante");	
                } else if (edad > 4 && edad < 10) {
                    System.out.println("Eres un niño(a)");
                } else {
                    System.out.println("Eres menor de edad");
                }
            } else if(edad >= 18 && edad <= 64) {
                System.out.println("Eres adulto xd viejo, dinosaurio");
            } else if (edad >= 65 && edad <= 120) {
                System.out.println("Eres un adulto mayor?");
            } else {
                System.out.println("Ingresa una edad válida");
            }
        }

    }
}
