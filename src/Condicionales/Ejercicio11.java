package Condicionales;

import java.util.Scanner;

public class Ejercicio11 {

    public void run (){
        char letra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        letra = sc.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'l':
                System.out.println("Lunes");
                break;
            case 'm':
                System.out.println("Martes");
                break;
            case 'x':
                System.out.println("Miércoles");
                break;
            case 'j':
                System.out.println("Jueves");
                break;
            case 'v':
                System.out.println("Viernes");
                break;
            case 's':
                System.out.println("Sábado");
                break;
            case 'd':
                System.out.println("Domingo");
                break;
            default:
                System.out.println("La letra ingresada no corresponde a un día de la semana");
        }
    }
}
