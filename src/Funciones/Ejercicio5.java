package Funciones;

public class Ejercicio5 {
    //Crea dos funciones "solucionRC1" y "solucionRC2" que devuelvan las dos raíces de una ecuación de segundo
    //grado. Además, deberás crear una función "existeSolucionRC", que devuelva un 1 si la raíz cuadrada tiene
    //solución, o un 0, si no la tiene
    public double solucionRC1(double a, double b, double c){
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public double solucionRC2(double a, double b, double c){
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public int existeSolucionRC(double a, double b, double c){
        return (Math.pow(b, 2) - 4 * a * c) >= 0 ? 1 : 0;
    }

    public void run(){
        double a = 1;
        double b = 5;
        double c = 6;

        if(existeSolucionRC(a, b, c) == 1){
            System.out.println("La solución 1 es: " + solucionRC1(a, b, c));
            System.out.println("La solución 2 es: " + solucionRC2(a, b, c));
        }else{
            System.out.println("No existe solución");
        }
    }
}
