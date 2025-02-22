package Condicionales;

import java.util.Scanner;

public class Ejercicio33 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el total a pagar por la compra: ");
        double totalAPagar = sc.nextDouble();

        System.out.println("Cuantas camisas se compraron: ");
        int camisas = sc.nextInt();

        double descuento = 0;


        if (camisas >= 3){
            descuento = totalAPagar * 0.20;
            System.out.println("Usted compró 3 o más camisas, por lo que tiene un descuento del 20%");
            System.out.println("El total a pagar con descuento es: " + (totalAPagar - descuento));
        } else {
            descuento = totalAPagar * 0.10;
            System.out.println("Usted compró menos de 3 camisas, por lo que tiene un descuento del 10%");
            System.out.println("El total a pagar con descuento es: " + (totalAPagar - descuento));
        }
    }
}
