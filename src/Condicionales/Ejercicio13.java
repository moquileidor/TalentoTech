package Condicionales;

import java.util.Scanner;
public class Ejercicio13 {
    //Escribir un programa que permita determinar la cantidad total a pagar por una llamada telefónica de N minutos
    //(introducido por el usuario), teniendo en cuenta lo siguiente:
    //• Las llamadas de 5 minutos o menos tienen un coste de 10 BsF.
    //• Cada minuto adicional a partir de los 5 primeros cuesta 2 BsF.
    public void run(){
        int minutos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos de la llamada: ");
        minutos = scanner.nextInt();
        int costo = 0;
        if (minutos <= 5){
            costo = 10;
        } else {
            costo = 10 + (minutos - 5) * 2;
        }
        System.out.println("El costo total de la llamada es: " + costo + " BsF");

    }
}
