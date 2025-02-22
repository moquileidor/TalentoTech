package Condicionales;

import java.util.Scanner;
public class Ejercicio18 {
    //La Dirección General de Tráfico necesita un programa que mida el índice alcohólico; dado el tipo de vehículo que
    //conduce un conductor, determine si da positivo en el control de alcoholemia o no. La tasa máxima de alcohol
    //según el tipo de vehículo se resume en la siguiente tabla:
    //Vehículo Indicador Tasa máxima
    //Camión C 0.3
    //Autobús A 0.3
    //Turismo T 0.5
    //Motocicleta M 0.3
    public void run() {
        Scanner sc = new Scanner(System.in);
        String tipoVehiculo;
        double tasaMedida;
        

        System.out.println("Ingrese el tipo de vehiculo: (C = Camión,A = Autobús,T = Turismo,M = Motocicleta)");
        tipoVehiculo = sc.nextLine();

        System.out.println("Ingrese la tasa de alcohol: ");
        tasaMedida = sc.nextDouble();

        double tasaMaxima = 0;
        if (tipoVehiculo.equalsIgnoreCase("C") ||
            tipoVehiculo.equalsIgnoreCase("A") ||
            tipoVehiculo.equalsIgnoreCase("M")) {
                tasaMaxima = 0.3;
        } else if (tipoVehiculo.equalsIgnoreCase("T")) {
            tasaMaxima = 0.5;
        } else {
            System.out.println("Opcion no valida");
        }

        if (tasaMedida > tasaMaxima){
            System.out.println("Positivo en el control de alcohol");
        } else {
            System.out.println("Negativo en el control de alcohol");
        }
    }
}
