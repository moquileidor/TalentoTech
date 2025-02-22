package Repeticion;

import java.util.Scanner;
//Leer 15 números negativos y convertirlos a positivos e imprimir dichos números.
public class Ejercicio7 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 15; i++){
            System.out.println("Ingrese un numero negativo: ");
            double num = scanner.nextDouble();
            if (num < 0) {
                System.out.println("El numero " + num + " convertido a positivo es: " + num * -1);
            } else {
                System.out.println("El numero " + num + " no es negativo");
                i -= 1;
            }
        }
    }
}
