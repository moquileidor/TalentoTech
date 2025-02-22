package Repeticion;

import java.util.Scanner;

public class Ejercicio5 {
    // Leer 10 números e imprimir solamente los números positivos.
    public void run(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            double numero = sc.nextDouble();
            if (numero > 0) {
                System.out.println("El numero " + numero + " es positivo");
            }
        }
    }
}
