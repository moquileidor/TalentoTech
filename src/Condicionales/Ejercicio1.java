package Condicionales;

import java.util.Scanner;

public class Ejercicio1 {

    public void run() {
        //Escribir un programa que solicite un valor entero al usuario y determine si es par o impar
        int valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        valor = scanner.nextInt();

        if (valor % 2 == 0) {
            System.out.println("El valor ingresado es par");
        } else {
            System.out.println("El valor ingresado es impar");
        }
    }
}
