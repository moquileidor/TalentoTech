package Condicionales;

import java.util.Scanner;

public class Ejercicio4 {

    //Calcular el mayor de dos números enteros introducidos por teclado.
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Ingrese un valor entero: ");
        valor1 = scanner.nextInt();
        System.out.println("Ingrese un segundo valor entero: ");
        valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println("El valor " + valor1 + " es mayor que " + valor2);
        } else if (valor1 < valor2) {
            System.out.println("El valor " + valor2 + " es mayor que " + valor1);
        } else {
            System.out.println("Los valores ingresados son iguales");
        }
    }

}
