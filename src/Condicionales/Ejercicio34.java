package Condicionales;

import java.util.Scanner;

public class Ejercicio34 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("CAUCHERA");

        System.out.println("Ingrese la cantidad de cauchos a comprar: ");
        int cantidad = sc.nextInt();
        int totalAPagar = 0;
        if (cantidad >= 5){
            totalAPagar = cantidad * 700;
            System.out.println("Usted compró 5 o más cauchos, por lo que cada uno le sale en 700bs");
            System.out.println("El total a pagar es: " + totalAPagar + "Bs.");
        } else {
            totalAPagar = cantidad * 800;
            System.out.println("Usted compró menos de 5 cauchos, por lo que cada uno le sale en 800bs");
            System.out.println("El total a pagar es: " + totalAPagar + "Bs.");
        }
    }
}
