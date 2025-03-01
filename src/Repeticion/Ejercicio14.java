package Repeticion;

import java.util.Scanner;

public class Ejercicio14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Double sumaTiempo = 0.0;

        for (int i = 1; i < 11; i++) {

            System.out.println("Atleta, por favor digite los datos registrado en el dia " + i );

            System.out.println("Cuanto tiempo realizó en el dia " + i + " en minutos: ");
            double tiempo = sc.nextDouble();
            if (tiempo < 0) {
                System.out.println("El tiempo no puede ser negativo");
                i--;
                continue;
            } else if (tiempo == 0) {
                System.out.println("El tiempo no puede ser 0");
                i--;
                continue;
            } else {
                if (tiempo > 16){
                    System.out.println("El atleta no es apto para la competencia");
                }
            }


            sumaTiempo += tiempo;
        }

        System.out.println("El promedio de tiempo de los 10 dias es: " + (sumaTiempo / 10));
    }


}
