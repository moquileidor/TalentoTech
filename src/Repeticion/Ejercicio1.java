package Repeticion;

public class Ejercicio1 {
    public void run(){
        //Realizar un programa que transforme todas las letras del alfabeto de mayúsculas a minúsculas.
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i + " -> " + Character.toLowerCase(i));
        }
    }
}
