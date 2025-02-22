package Repeticion;

import java.util.Scanner;

public class Ejercicio10 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para hacer la tabla de muktiplicar: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
