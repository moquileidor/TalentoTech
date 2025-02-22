package Condicionales;

import java.util.Scanner;

public class Ejercicio31 {
    //Hacer un programa que imprima el nombre de un artículo, clave, precio original y su precio con descuento. El
    //descuento lo hace en base a la clave, si la clave es 01 el descuento es del 10% y si la clave es 02 el descuento en
    //del 20% (solo existen dos claves).

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el precio original del articulo: ");
        double precio = sc.nextDouble();

        System.out.println("Ingrese la clave del articulo: ");
        System.out.println("01. Descuento del 10%");
        System.out.println("02. Descuento del 20%");
        int clave = sc.nextInt();

        double descuento = 0;

        if (clave == 1){
            descuento = precio * 0.10;
        } else if (clave == 2){
            descuento = precio * 0.20;
        } else {
            System.out.println("Clave no válida");
        }

        if (clave == 1 || clave == 2){
            System.out.println("Nombre del articulo: " + nombre);
            System.out.println("Precio original: " + precio);
            System.out.println("Precio con descuento: " + (precio - descuento));
        }
    }
}
