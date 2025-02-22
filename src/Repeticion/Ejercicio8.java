package Repeticion;

import java.util.Scanner;

public class Ejercicio8 {
    //Calcular de la suma y la media aritmética de N números reales. Solicitar el valor de N al usuario y cada uno de los
    //N números reales.
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a sumar: ");
        int cantidad = sc.nextInt();

        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un número: ");
            suma += sc.nextDouble();
        }
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media aritmética de los números es: " + suma / cantidad);

    }
}
