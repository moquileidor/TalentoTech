package Condicionales;

import java.util.Scanner;

public class Ejercicio15 {
    //Una empresa de préstamos decidió cambiar su esquema de cobros así:
    //• Si el préstamo es de más de 5000 euros, cobra en tres cuotas
    //• Si el préstamo es de menos de 1000 euros, cobra en una cuota
    //• Si el préstamo es entre 2000 y 3000 euros cobra en dos cuotas
    //• En los demás casos cobra en cinco cuotas
    //Adicionalmente, si es de menos de 4000 euros cobra el 12% de interés, en caso contrario cobra el 10% de interés.
    //El programa debe decir en cuántas cuotas debe pagar y de cuánto es cada cuota. Para ello, se calcula el valor
    //total de la deuda con interés y se divide en cuotas iguales.
    public void run () {

        double prestamo;
        double interes;
        int cuotas;
        double cuota;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto del préstamo: ");
        prestamo = scanner.nextDouble();

        if (prestamo > 5000) {
            cuotas = 3;
        } else if (prestamo < 1000) {
            cuotas = 1;
        } else if (prestamo >= 2000 && prestamo <= 3000) {
            cuotas = 2;
        } else {
            cuotas = 5;
        }

        if (prestamo < 4000) {
            interes = 0.12;
        } else {
            interes = 0.10;
        }

        cuota = (prestamo + prestamo * interes) / cuotas;
        System.out.println("El préstamo se pagará en " + cuotas + " cuotas");
        System.out.println("El monto total a pagar es: " + (prestamo + prestamo * interes));
        System.out.println("El monto de cada cuota es: " + cuota);


    }
}
