package Condicionales;

import java.util.Scanner;

public class Ejercicio29 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int puntosIMECA1, puntosIMECA2, puntosIMECA3, puntosIMECA4, puntosIMECA5;
        double promedioIMECA;
        double gananciaDiarias;
        double dineroPerdido;

        System.out.println("Ingrese los puntos IMECA del dia 1: ");
        puntosIMECA1 = sc.nextInt();
        System.out.println("Ingrese los puntos IMECA del dia 2: ");
        puntosIMECA2 = sc.nextInt();
        System.out.println("Ingrese los puntos IMECA del dia 3: ");
        puntosIMECA3 = sc.nextInt();
        System.out.println("Ingrese los puntos IMECA del dia 4: ");
        puntosIMECA4 = sc.nextInt();
        System.out.println("Ingrese los puntos IMECA del dia 5: ");
        puntosIMECA5 = sc.nextInt();

        System.out.println("Ingrese las ganancias de la fabrica: ");
        gananciaDiarias = sc.nextDouble();

        promedioIMECA = (puntosIMECA1 + puntosIMECA2 + puntosIMECA3 + puntosIMECA4 + puntosIMECA5) / 5.0;

        if (promedioIMECA > 170){
            double multa = gananciaDiarias * 0.50;
            dineroPerdido = multa * 7;
            System.out.println("La fabrica debe detener su produccion por una semana.");
            System.out.println("Dinero perdido por la sanción: " + dineroPerdido);
        } else {
            System.out.println("La fabrica  no tiene sancion ni multa.");
        }

        sc.close();



    }
}
