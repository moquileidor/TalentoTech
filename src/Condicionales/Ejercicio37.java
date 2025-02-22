package Condicionales;

import java.util.Scanner;

public class Ejercicio37 {
    // Una compañía de seguros esta abriendo un departamento de finanzas y estableció un programa para captar
    //clientes, que consiste en lo siguiente: Si el monto por el que se efectúa la fianza es menor que Bs. 50.000 la cuota
    //a pagar será por el 3% del monto, y si el monto es mayor que Bs. 50.000 la cuota a pagar será el 2% del monto.
    //La afianzadora desea determinar cual será la cuota que debe pagar un cliente.

    public void run(){
        Scanner scanner = new Scanner(System.in);

        double monto = 0;
        double cuota = 0;
        System.out.println("Ingrese el monto de la fianza: ");
        monto = scanner.nextDouble();
        if (monto < 50000){
            cuota = monto * 0.03;
        } else {
            cuota = monto * 0.02;
        }
        System.out.println("La cuota a pagar es: " + cuota);
    }
}
