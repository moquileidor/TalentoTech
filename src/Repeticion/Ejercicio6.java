package Repeticion;

import java.util.Scanner;

public class Ejercicio6 {
    public void run(){
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++){
            System.out.println("Ingrese un numero: ");
            double num = sc.nextDouble();
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
