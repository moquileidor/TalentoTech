package Condicionales;

import java.util.Scanner;

public class Ejercicio16 {

    // Calcular el salario neto de un trabajador de una empresa cuyo trabajo se paga por horas. Introducir por teclado el
    //número de horas y el precio de la hora. El cálculo se realiza del siguiente modo:
    //• Las primeras 35 horas de cada semana se pagan a la tarifa normal (suponer 4 semanas al mes).
    //• Las horas extras se pagan un 50% más que las normales.
    //• Los impuestos a deducir a los trabajadores varían en función de su sueldo mensual (considerando las horas
    //extras trabajadas):
    //o Si el sueldo es menor de € 600, libre de impuestos.
    //o Si el sueldo está entre € 600 y € 1000, los impuestos son el 20%.
    //o Si el sueldo es mayor de € 1000, el 30%.
    public void run() {
        double horas, precioHora, salario, salarioNeto, impuestos;
        double horasExtras, salarioExtra, salarioTotal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas: ");
        horas = scanner.nextDouble();
        System.out.println("Ingrese el precio de la hora: ");
        precioHora = scanner.nextDouble();

        if (horas <= 35) {
            salario = horas * precioHora;
            salarioExtra = 0;
        } else {
            horasExtras = horas - 35;
            salario = 35 * precioHora;
            salarioExtra = horasExtras * precioHora * 1.5;
        }

        salarioTotal = salario + salarioExtra;

        if (salarioTotal < 600) {
            impuestos = 0;
        } else if (salarioTotal >= 600 && salarioTotal <= 1000) {
            impuestos = salarioTotal * 0.20;
        } else {
            impuestos = salarioTotal * 0.30;
        }

        salarioNeto = salarioTotal - impuestos;
        System.out.println("El salario neto del trabajador es: " + salarioNeto);

    }
}
