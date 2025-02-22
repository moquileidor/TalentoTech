package Condicionales;

import java.util.Scanner;

public class Ejercicio24 {
    //Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
    //• Si trabaja 40 horas o menos se le paga Bs. 16 por hora.
    //• Si trabaja más de 40 horas se le paga Bs. 16 por cada una de las primeras 40 horas y Bs. 20 por cada hora
    //extra.

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        int totalAPagar = 0;

        if (horasTrabajadas <= 40){
            totalAPagar = horasTrabajadas * 16;
        } else {
            totalAPagar = (40 * 16) + ((horasTrabajadas - 40) * 20);
        }

        System.out.println("El salario en total por " + horasTrabajadas + " horas trabajadas es: " + totalAPagar + "Bs.");

    }
}
