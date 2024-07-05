package SeptimaClase;

import java.util.Scanner;

public class comparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.println("Ingresa la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        scanner.close();

        System.out.println(palabra2.equals(palabra1) ? "Las palabras son iguales" : "Las palabras son diferentes");
    }
}
