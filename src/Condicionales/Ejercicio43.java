package Condicionales;

import java.util.Scanner;

public class Ejercicio43 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        System.out.println("Ingrese otro numero: ");
        int numero2 = sc.nextInt();
        int total = 0;
        if (numero == numero2){
            total = numero * numero2;
            System.out.println("La multiplicacion de los numeros es: " + total);
        } else if (numero > numero2) {
            total = numero - numero2;
            System.out.println("La resta de los numeros es: " + total);
        } else {
            total = numero + numero2;
            System.out.println("La suma de los numeros es: " + total);
        }

    }
}
