package Condicionales;

import java.util.Scanner;

public class Ejercicio42 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el lado n°1: " );
        double l1 = sc.nextDouble();
        System.out.println("Ingrese el lado n°2: " );
        double l2 = sc.nextDouble();
        System.out.println("Ingrese el lado n°3: " );
        double l3 = sc.nextDouble();

        if (l1 == l2 && l2 == l3){
            System.out.println("El triángulo es equilátero");
        }else if (l1 == l2 || l2 == l3 || l1 == l3){
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }
    }
}
