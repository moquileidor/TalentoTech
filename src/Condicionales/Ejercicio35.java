package Condicionales;

import java.util.Scanner;

public class Ejercicio35 {
    //En un supermercado se hace una promoción, mediante la cual el cliente obtiene un descuento dependiendo de un
    //número que se escoge al azar. Si el numero escogido es menor que 74 el descuento es del 15% sobre el total de
    //la compra, si es mayor o igual a 74 el descuento es del 20%. Obtener cuanto dinero se le descuenta.
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el total a pagar por la compra: ");
        double totalAPagar = sc.nextDouble();

        System.out.println("Ingrese el número escogido al azar: ");
        int numero = sc.nextInt();

        double descuento = 0;

        if (numero < 74){
            descuento = totalAPagar * 0.15;
            System.out.println("El número escogido es menor a 74, por lo que tiene un descuento del 15%");
            System.out.println("El total a pagar con descuento es: " + (totalAPagar - descuento));
        } else {
            descuento = totalAPagar * 0.20;
            System.out.println("El número escogido es mayor o igual a 74, por lo que tiene un descuento del 20%");
            System.out.println("El total a pagar con descuento es: " + (totalAPagar - descuento));
        }
    }
}
