package Repeticion;

import java.util.Scanner;

public class Ejercicio13 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int totalAutos = 25;
        double sumaContaminacion = 0;
        double minContaminacion = 0, maxContaminacion = 0;

        for (int i = 0; i < totalAutos; i++) {
            System.out.println("Ingrese la canitdad de contaminación del auto" + (i+1));
            double contaminacion = sc.nextDouble();

            if (i == 0) {
                minContaminacion = contaminacion;
                maxContaminacion = contaminacion;
            } else {
                if (contaminacion < minContaminacion) {
                    minContaminacion = contaminacion;
                }
                if (contaminacion > maxContaminacion) {
                    maxContaminacion = contaminacion;
                }
            }

            sumaContaminacion += contaminacion;
        }

        System.out.println("Promedio de contaminación: " + (sumaContaminacion / totalAutos));
        System.out.println("Contaminación más baja: " + minContaminacion);
        System.out.println("Contaminación más alta: " + maxContaminacion);



    }
}
