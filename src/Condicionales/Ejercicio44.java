package Condicionales;

import java.util.Scanner;

public class Ejercicio44 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double numero = sc.nextDouble();

        System.out.println("Ingrese otro numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("Ingrese otro numero");
        double numero3 = sc.nextDouble();

        if (numero > numero2 && numero > numero3){
            System.out.println("El numero mayor es: " + numero);
        } else if (numero2 > numero && numero2 > numero3){
            System.out.println("El numero mayor es: " + numero2);
        } else if(numero3 > numero && numero3 > numero2){
            System.out.println("El numero mayor es: " + numero3);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
