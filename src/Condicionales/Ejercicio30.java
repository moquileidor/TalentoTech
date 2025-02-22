package Condicionales;

import java.util.Scanner;

public class Ejercicio30 {
    //Una persona enferma, que pesa 70 Kg, se encuentra en reposo y desea saber cuantas calorías consume su
    //cuerpo durante todo el tiempo que realice una misma actividad. Las actividades que tiene permitido realizar son
    //únicamente dormir o estar sentado en reposo. Los datos que tiene son que estando dormido consume 1,08
    //calorías por minuto y estando sentado en reposo consume 1,66 calorías por minuto.
    //
    public void run(){
        Scanner sc = new Scanner(System.in);
        double caloriasDormido = 1.08;
        double caloriasSentado = 1.66;

        System.out.println("Ingrese el tiempo en minutos que estará realizando la actividad: ");
        int tiempo = sc.nextInt();

        System.out.println("Seleccione la actividad que realizará: ");
        System.out.println("1. Dormir");
        System.out.println("2. Sentado en reposo");
        int opcion = sc.nextInt();

        double caloriasTotales = 0;

        if (opcion == 1){
            caloriasTotales = caloriasDormido * tiempo;
        } else if (opcion == 2){
            caloriasTotales = caloriasSentado * tiempo;
        } else {
            System.out.println("Opción no válida");
        }

        if (opcion == 1 || opcion == 2){
            System.out.println("La cantidad de calorías consumidas es: " + caloriasTotales);
        }

        sc.close();
    }
}
