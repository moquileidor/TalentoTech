package Repeticion;

import java.util.Scanner;

public class Ejercicio11 {
    //Una persona debe realizar un muestreo con 50 personas para determinar el promedio de peso de los niños,
    //jóvenes, adultos y viejos que existen en su zona habitacional.
    //Se determinan las categorías con base en la siguiente tabla:
    //CATEGORIA EDAD
    //Niños 0 – 13
    //Jóvenes 13 – 29
    //Adultos 30 – 59
    //Viejos 60 en adelante
    public void run(){
        Scanner sc = new Scanner(System.in);

        int ninos = 0;
        int jovenes = 0;
        int adultos = 0;
        int viejos = 0;

        double pesoNinos = 0;
        double pesoJovenes = 0;
        double pesoAdultos = 0;
        double pesoViejos = 0;

        for (int i = 0; i < 50; i++) {
            System.out.println("Ingrese la edad de la persona " + (i + 1));
            int edad = sc.nextInt();
            System.out.println("Ingrese el peso de la persona " + (i + 1));
            double peso = sc.nextDouble();

            if (edad >= 0 && edad <= 13) {
                ninos++;
                pesoNinos += peso;
            } else if (edad >= 13 && edad <= 29) {
                jovenes++;
                pesoJovenes += peso;
            } else if (edad >= 30 && edad <= 59) {
                adultos++;
                pesoAdultos += peso;
            } else if (edad >= 60) {
                viejos++;
                pesoViejos += peso;
            }

        }
        System.out.println("Promedio de peso de niños: " + (pesoNinos / ninos));
        System.out.println("Promedio de peso de jóvenes: " + (pesoJovenes / jovenes));
        System.out.println("Promedio de peso de adultos: " + (pesoAdultos / adultos));
        System.out.println("Promedio de peso de viejos: " + (pesoViejos / viejos));

    }
}
