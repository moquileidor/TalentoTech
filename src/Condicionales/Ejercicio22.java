package Condicionales;

import java.util.Scanner;

public class Ejercicio22 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el total de la compra: ");
        int total = sc.nextInt();

        if (total > 1000){
            double descuento = total * 0.80 ;
            System.out.println("El total de la compra es: " + descuento);
        } else {
            System.out.println("El total de la compra es: " + total);
        }
    }
}
