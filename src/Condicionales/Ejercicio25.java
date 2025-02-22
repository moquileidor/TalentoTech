package Condicionales;

import java.util.Scanner;

public class Ejercicio25 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num2);
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println("Son iguales");
        }
    }
}
