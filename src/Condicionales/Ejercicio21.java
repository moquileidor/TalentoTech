package Condicionales;

import java.util.Scanner;

public class Ejercicio21 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        float nota = sc.nextFloat();

        System.out.println("Ingrese la segunda nota: ");
        float seg = sc.nextFloat();

        System.out.println("Ingrese la terca nota: ");
        float ter = sc.nextFloat();


        float total = (nota + seg + ter) / 3;

        if (total < 70){
            System.out.println("Ha reprobado ");
        } else {
            System.out.println("Ha reprobado ");
        }
    }
}

