package Condicionales;

import java.util.Scanner;
public class Ejercicio8 {
    public void run() {
        //Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un
        //año y devuelva si es bisiesto o no.

        int año;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        año = scanner.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }

    }
}
