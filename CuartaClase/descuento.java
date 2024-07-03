import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            double numero;

            System.out.print("Ingresa el precio del producto: ");
            numero = scanner.nextDouble();
            if (numero >= 100) {
                double nuevo;
                nuevo = numero - ((numero * 10 )/ 100) ;
                System.out.println("El precio con descuento es: " + nuevo);
            } else {
                System.out.println("No se aplica descuento, el precio es: " + numero);
            }
        }
    }
}
