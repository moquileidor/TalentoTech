package Condicionales;

import java.util.Scanner;

public class Ejercicio40 {
    //Una empresa de bienes raíces ofrece casas de interés social, bajo las siguientes condiciones: Si los ingresos del
    //comprador son mayores de Bs. 8.000 o más el enganche será del 15% del costo de la casa y el resto se distribuirá
    //en pagos mensuales, a pagar en diez años. Si los ingresos del comprador son menos de Bs. 8.000 o igual el
    //enganche será del 30% del costo de la casa y el resto se distribuirá en pagos mensuales a pagar en 7 años. La
    //empresa quiere obtener cuanto debe pagar un comprador por concepto de enganche y cuanto por cada pago
    //parcial.
    public void run(){
        Scanner sc = new Scanner(System.in);

        double ingresos;
        double costoCasa = 100000;
        double enganche = 0;
        double pagosMensuales = 0;
        int años = 0;

        System.out.println("Ingrese los ingresos del comprador: ");
        ingresos = sc.nextDouble();

        if(ingresos >= 8000){
            enganche = costoCasa * 0.15;
            pagosMensuales = (costoCasa - enganche) / 120;
            años = 10;
        }else{
            enganche = costoCasa * 0.30;
            pagosMensuales = (costoCasa - enganche) / 84;
            años = 7;
        }

        System.out.println("El enganche es: " + enganche);
        System.out.println("El pago mensual es: " + pagosMensuales);
        System.out.println("Los años a pagar son: " + años);
    }
}
