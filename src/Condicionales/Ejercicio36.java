package Condicionales;

import java.util.Scanner;

public class Ejercicio36 {
    //Calcular el número de pulsaciones que debe tener una persona por cada 10 segundos de ejercicio aeróbico; la
    //formula que se aplica cuando el sexo es femenino es:
    //• número pulsaciones = (220 - edad) / 10
    //y si el sexo es masculino:
    //• número pulsaciones = (210 - edad) / 10
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 36.");

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese su sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        int pulsaciones = 0;

        if (sexo == 'F' || sexo == 'f'){
            pulsaciones = (220 - edad) / 10;

        } else if (sexo == 'M' || sexo == 'm'){
            pulsaciones = (210 - edad) / 10;
        } else {
            System.out.println("Sexo no válido.");
            return;
        }

        System.out.println("El número de pulsaciones por cada 10 segundos de ejercicio aeróbico es: " + pulsaciones);
    }

}
