package Condicionales;

import java.util.Scanner;

public class Ejercicio14 {
    //4. El dueño de una papelería desea un programa que le indique el precio de venta de un artículo dado. El precio se
    //calcula de acuerdo con la siguiente fórmula: PVP = precio_coste + ganancia. Donde la ganancia será:
    //• El 15% si el precio de coste es inferior Bs. 3.
    //• 50 céntimos si el precio de coste está entre Bs. 3 y Bs. 6.
    //• El 25% si el precio de coste supera los Bs. 6.
    public void run () {

        double precioCoste;
        double ganancia;
        double precioVenta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio de coste del artículo: ");
        precioCoste = scanner.nextDouble();

        if (precioCoste < 3) {
            ganancia = precioCoste * 0.15;
        } else if (precioCoste >= 3 && precioCoste <= 6) {
            ganancia = 0.5;
        } else {
            ganancia = precioCoste * 0.25;
        }

        precioVenta = precioCoste + ganancia;
        System.out.println("El precio de venta del artículo es: " + precioVenta);

    }
}
