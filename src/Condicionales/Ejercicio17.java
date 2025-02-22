package Condicionales;

import java.util.Scanner;
public class Ejercicio17 {
    // En una empresa cada empleado debe teclear un código identificador de 3 cifras en la entrada. Escribir un
    //programa que muestre por pantalla la categoría del empleado teniendo en cuenta que:
    //• Si el código es divisible por 2, por 3 y por 5, la categoría del empleado es “Director general”.
    //• Si el código es divisible por 3 y por 5 pero no por 2, la categoría del empleado es “Directivo”.
    //• Si el código es divisible por 2, pero no por 3 ni por 5, la categoría del empleado es “Staff”.
    //• Si el código no es divisible por 2, ni por 3 ni por 5, la categoría del empleado es “Seguridad”.
    //Recuerde que: Un numero X es divisible por otro Y; si X mod Y = 0.
    public void run(){

        int codigo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código del empleado: ");
        codigo = scanner.nextInt();
        if (codigo % 2 == 0 && codigo % 3 == 0 && codigo % 5 == 0) {
            System.out.println("Director general");
        } else if (codigo % 3 == 0 && codigo % 5 == 0 && codigo % 2 != 0) {
            System.out.println("Directivo");
        } else if (codigo % 2 == 0 && codigo % 3 != 0 && codigo % 5 != 0) {
            System.out.println("Staff");
        } else {
            System.out.println("Seguridad");
        }

    }
}
