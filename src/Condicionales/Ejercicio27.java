package Condicionales;

import java.util.Scanner;

public class Ejercicio27 {
    //Hacer un programa que realice las operaciones matemáticas básicas: suma, resta, multiplicación y división de dos
    //números enteros.

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();

        System.out.println("La suma de los numeros es: " + (num1 + num2));
        System.out.println("La resta de los numeros es: " + (num1 - num2));
        System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
        if( num2 == 0 ) {
            System.out.println("No se puede dividir por 0");
        } else {
            System.out.println("La division de los numeros es: " + (num1 / num2));
        }
    }
}
