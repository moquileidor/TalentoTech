package Repeticion;

import java.util.Scanner;

public class Ejercicio4 {
    public void run(){
        //Leer 10 números y obtener su cubo y su cuarta
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número");
            double numero = scanner.nextDouble();
            System.out.println("El cubo de " + numero + " es: " + Math.pow(numero, 3));
            System.out.println("La cuarta de " + numero + " es: " + Math.pow(numero, 4));
        }
    }
}
