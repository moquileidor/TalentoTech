package Condicionales;

import java.util.Scanner;

public class Ejercicio3 {

    //Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de
    //ambos. Mostrar los resultados por pantalla.

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        int valor1 = scanner.nextInt();

        if (valor1 > 0) {
            System.out.println("Ingrese un segundo valor entero: ");
            int valor2 = scanner.nextInt();

            int suma = valor1 + valor2;
            int resta = valor1 - valor2;
            int producto = valor1 * valor2;

            System.out.println("La suma de los valores ingresados es: " + suma);
            System.out.println("La resta de los valores ingresados es: " + resta);
            System.out.println("El producto de los valores ingresados es: " + producto);
        } else {
            System.out.println("Ingrese un valor positivo");
        }
    }
}
