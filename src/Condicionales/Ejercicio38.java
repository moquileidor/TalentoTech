package Condicionales;

import java.util.Scanner;

public class Ejercicio38 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de materias a cursar: ");
        int materias = sc.nextInt();
        int valorMateria = 350000;

        int total = materias * valorMateria;

        System.out.println("El valor de cada materia es: " + valorMateria);
        System.out.println("El valor total a pagar es: " + total);


    }
}
