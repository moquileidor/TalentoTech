package Condicionales;

import java.util.Scanner;

public class Ejercicio23 {

    public static int dia(int anio){
        int año = 0;
        int A = año % 19;
        int B = año % 4;
        int C = año % 7;

        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = 22 + D + E; // Día del domingo de Pascua
        return N;
    }

    public void Run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un año: ");
        int ano = sc.nextInt();

        int dia = dia(ano);

        if(dia <= 31){
            System.out.println("El domingo de pascua en el año: " + ano + " es el " + dia + " de marzo");
        } else {
            System.out.println("El Domingo de Pascua en el año " + ano + " es el " + (dia - 31) + " de abril.");
        }
    }
}
