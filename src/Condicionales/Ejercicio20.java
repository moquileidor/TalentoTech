package Condicionales;

import java.util.Scanner;

public class Ejercicio20 {
    //Capricornio del 22 de diciembre al 20 de enero
    //Acuario del 21 de enero al 19 de febrero
    //Piscis del 20 de febrero al 20 de marzo
    //Aries del 21 de marzo al 19 de abril
    //Tauro del 20 de abril al 20 de mayo
    //Géminis del 21 de mayo al 21 de junio
    //Cáncer del 22 de junio al 21 de julio
    //Leo del 22 de julio al 21 de agosto
    //Virgo del 22 de agosto al 22 de septiembre
    //Libra del 23 de septiembre al 22 de octubre
    //Escorpio del 23 de octubre al 21 de noviembre
    //Sagitario del 22 de noviembre al 21 de diciembre
    public void run(){
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;

        System.out.println("Ingrese su dia de nacimiento: ");
        dia = sc.nextInt();

        System.out.println("Ingrese su mes de nacimiento: ");
        mes = sc.nextInt();

        if (dia < 1 || dia > 31 ){
            System.out.println("El dia de nacimiento es incorrecto");
        } else {
            if (mes < 1 || mes > 12){
                System.out.println("El mes de nacimiento es incorrecto");
            } else {
                if (mes == 12 && dia >= 22 || mes == 1 && dia <= 20  ){
                    System.out.println("Tu signo es Capricornio");
                } else if (mes == 1 && dia >= 21 || mes == 2 && dia <= 19){
                    System.out.println("Tu signo es Acuario");
                } else if (mes == 2 && dia >= 20 || mes == 3 && dia <= 20){
                    System.out.println("Tu signo es Piscis");
                } else if (mes == 3 && dia >= 21 || mes == 4 && dia <= 19){
                    System.out.println("Tu signo es Aries");
                } else if (mes == 4 && dia >= 20 || mes == 5 && dia <= 20){
                    System.out.println("Tu signo es Tauro");
                } else if (mes == 5 && dia >= 21 || mes == 6 && dia <= 21){
                    System.out.println("Tu signo es Geminis");
                } else if (mes == 6 && dia >= 22 || mes == 7 && dia <= 21){
                    System.out.println("Tu signo es Cancer");
                } else if (mes == 7 && dia >= 22 || mes == 8 && dia <= 21){
                    System.out.println("Tu signo es Leo");
                } else if (mes == 8 && dia >= 22 || mes == 9 && dia <= 22){
                    System.out.println("Tu signo es Virgo");
                } else if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22){
                    System.out.println("Tu signo es Libra");
                } else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
                    System.out.println("Tu signo es Sagitario");
                }
            }
        }





    }
}
