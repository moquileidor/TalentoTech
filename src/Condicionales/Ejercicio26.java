package Condicionales;

import java.util.Scanner;

public class Ejercicio26 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Convertir de pies a metros");
        System.out.println("2. Convertir de metros a pies");
        System.out.println("Seleccione una opcion: ");
        int opcion = sc.nextInt();
        double pies;
        double metros;
        switch(opcion){
            case 1:
                System.out.println("Escriba el numero de pies: ");
                pies = sc.nextDouble();

                metros = pies * 0.3048;
                System.out.println(pies + " pies son: " + metros + " metros.");
                break;
            case 2:
                System.out.println("Escriba el numero de metros a pies: ");
                metros= sc.nextDouble();

                pies = metros * 3.28084;
                System.out.println(metros + " metros son: " + pies + " pies.");
                break;
            default:
                System.out.println("Opcion no valida.");
        }

        sc.close();
    }
}
