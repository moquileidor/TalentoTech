package Condicionales;

import java.util.Scanner;

public class Ejercicio2 {

    //Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        int valor = scanner.nextInt();

        if (valor > 0){
            System.out.println("El valor ingresado es positivo");
        } else if (valor < 0){
            System.out.println("El valor ingresado es negativo");
        } else {
            System.out.println("El valor ingresado es cero");
        }
    }

}
