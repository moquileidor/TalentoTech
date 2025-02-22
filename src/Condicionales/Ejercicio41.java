package Condicionales;

import java.util.Scanner;

public class Ejercicio41 {

    public void run() {
        Scanner sc = new Scanner(System.in);

        double montoHipoteca;
        double inversionTotal;
        double inversionBanco;
        double inversionSocio;

        // Solicitar datos al usuario
        System.out.print("Ingrese el monto de la hipoteca: ");
        montoHipoteca = sc.nextDouble();

        System.out.print("Ingrese el monto total de la inversión requerida: ");
        inversionTotal = sc.nextDouble();

        if (montoHipoteca < 1000000) {
            // Si la hipoteca es menor a Bs. 1.000.000, la inversión se divide 50/50 con el socio
            inversionBanco = inversionTotal * 0.5;
            inversionSocio = inversionTotal * 0.5;
        } else {
            // Si la hipoteca es Bs. 1.000.000 o más, se usa la hipoteca completa y el resto se divide con el socio
            inversionBanco = montoHipoteca;
            double inversionRestante = inversionTotal - montoHipoteca;

            if (inversionRestante > 0) {
                inversionSocio = inversionRestante / 2;
            } else {
                inversionSocio = 0; // Si la hipoteca cubre toda la inversión, el socio no aporta nada
            }
        }

        // Mostrar resultados
        System.out.println("La inversión del banco es: " + inversionBanco);
        System.out.println("La inversión del socio es: " + inversionSocio);

        sc.close();
    }
}
