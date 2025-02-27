package Repeticion;
import java.util.Scanner;
public class Ejercicio12 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int clientes = 15;
        double precioKilo = 6500;
        double descuento = 0.15;
        double totalTienda = 0;

        for (int i = 1 ; i < clientes; i++) {
            System.out.println("Cliente " + 1 + ", ingrese la cantidad de kilos comprados: ");
            double kilos = sc.nextDouble();

            double total = kilos * precioKilo;
            if (kilos > 10) {
                total -= total * descuento;
            }
            System.out.println("Clliente " + i + ", el total a pagar es: " + total);
            totalTienda += total;
        }
        System.out.println("El total de la tienda es: " + totalTienda);
    }
}
