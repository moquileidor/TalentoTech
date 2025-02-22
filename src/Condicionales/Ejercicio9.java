package Condicionales;

import java.util.Scanner;

public class Ejercicio9 {

    //Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el año no es bisiesto.
    int dia, mes, año;
    Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Ingrese el día: ");
        dia = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = scanner.nextInt();
        System.out.println("Ingrese el año: ");
        año = scanner.nextInt();

        if (dia == 31 && mes == 12) {
            dia = 1;
            mes = 1;
            año++;
        } else if (dia == 31) {
            dia = 1;
            mes++;
        } else {
            dia++;
        }

        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);
    }

}
