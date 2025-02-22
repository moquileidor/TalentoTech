package Condicionales;

import java.util.Scanner;

public class Ejercicio7 {

    public void run() {
        int valor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura del agua: ");
        valor = scanner.nextInt();

        if (valor < 0) {
            System.out.println("El agua se encuentra en estado solido");
        } else if (valor < 100) {
            System.out.println("El agua se encuentra en estado liquido");
        } else {
            System.out.println("El agua se encuentra en estado gaseoso");
        }

    }
}
