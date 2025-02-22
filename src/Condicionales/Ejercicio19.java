package Condicionales;

import java.util.Scanner;
public class Ejercicio19 {
    public void run(){
        String tipoVehiculo;
        String tipoHora;
        int numeroPasajeros;
        int totalAPagar = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehiculo: (Camión o automóvil)");
        tipoVehiculo = sc.nextLine();

        System.out.println("Ingrese el tipo de hora: (Y para congestionada X para no congestionada)");
        tipoHora = sc.nextLine();

        System.out.println("Ingrese el numero de pasajeros: ");
        numeroPasajeros = sc.nextInt();

        if (tipoVehiculo.equalsIgnoreCase("camion")) {
            if (tipoHora.equalsIgnoreCase("Y")) {
                totalAPagar = 50;
            } else if (tipoHora.equalsIgnoreCase("X")) {
                totalAPagar = 30;
            }
        } else if (tipoVehiculo.equalsIgnoreCase("automovil")) {
            if (tipoHora.equalsIgnoreCase("Y")) {
                if (numeroPasajeros < 3){
                    totalAPagar = 25 ;
                }
            } else if (tipoHora.equalsIgnoreCase("X")) {
                totalAPagar = 25;
            }
        }
        System.out.println("El total a pagar es: " + totalAPagar);
    }
}
