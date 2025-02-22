package Condicionales;

import java.util.Scanner;
public class Ejercicio12 {
    //Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es correcta. Para que una fecha sea correcta es
    //necesario:
    //• El año debe ser mayor que cero.
    //• El mes debe estar entre 1 y 12.
    //• Dependiendo del mes que sea, el día debe estar dentro de los límites válidos. Los meses que tienen 31 días
    //son 1, 3, 5, 7, 8, 10 y 12. Los meses de 30 días son 4, 6, 9 y 11. El mes de 28 días es 2, excepto en un año
    //bisiesto que es 29 días.
    public void run() {
        int dia, mes, año;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día: ");
        dia = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = scanner.nextInt();
        System.out.println("Ingrese el año: ");
        año = scanner.nextInt();

        if (año > 0 && mes >= 1 && mes <= 12) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    System.out.println("La fecha ingresada es correcta");
                } else {
                    System.out.println("La fecha ingresada es incorrecta");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    System.out.println("La fecha ingresada es correcta");
                } else {
                    System.out.println("La fecha ingresada es incorrecta");
                }
            } else if (mes == 2) {
                if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                    if (dia >= 1 && dia <= 29) {
                        System.out.println("La fecha ingresada es correcta");
                    } else {
                        System.out.println("La fecha ingresada es incorrecta");
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        System.out.println("La fecha ingresada es correcta");
                    } else {
                        System.out.println("La fecha ingresada es incorrecta");
                    }
                }
            }
        } else {
            System.out.println("La fecha ingresada es incorrecta");
        }


    }
}
