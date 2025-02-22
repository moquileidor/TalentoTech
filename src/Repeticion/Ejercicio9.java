package Repeticion;

import java.util.Scanner;

public class Ejercicio9 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        double promedio = 0, suma, calificacionBaja = 0;
        suma = 0;

        System.out.println("Ingrese la cantidad de calificaciones: ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la calificación " + (i + 1));
            double calificacion = sc.nextDouble();
            suma += calificacion;
            if (i == 0) {
                calificacionBaja = calificacion;
            } else {
                if (calificacion < calificacionBaja) {
                    calificacionBaja = calificacion;
                }
            }
            promedio = suma / cantidad;

        }
        System.out.println("El promedio de las calificaciones es: " + promedio);
        System.out.println("La calificación más baja es: " + calificacionBaja);
    }
}
