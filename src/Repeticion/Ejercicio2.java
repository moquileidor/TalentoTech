package Repeticion;

import java.util.Scanner;

public class Ejercicio2 {
    //Programa que lee las edades de un grupo de 100 alumnos y encuentra el promedio.
    public void run(){
        int suma = 0;
        int edad;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la edad del alumno " + (i + 1));
            edad = scanner.nextInt();
            suma += edad;
        }

        System.out.println("El promedio de las edades es: " + suma / 5);
    }
}
