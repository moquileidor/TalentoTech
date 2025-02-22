package Repeticion;

import java.util.Scanner;

public class Ejercicio3 {
    //Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Cálculo.
    public void run(){
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese la calificación " + (i + 1));
            suma += scanner.nextDouble();
        }
        System.out.println("El promedio de las calificaciones es: " + suma / 7);

    }
}