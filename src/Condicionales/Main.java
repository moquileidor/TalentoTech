package Condicionales;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio3 ejercicio3 = new Ejercicio3();

        Scanner scanner = new Scanner(System.in);


        int opcion = 0;
        System.out.println("Seleccione el ejercicio que desea ejecutar: ");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio  9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.println("12. Ejercicio 12");
        System.out.println("13. Ejercicio 13");
        System.out.println("14. Ejercicio 14");
        System.out.println("15. Ejercicio 15");
        System.out.println("16. Ejercicio 16");
        System.out.println("17. Ejercicio 17");
        System.out.println("18. Ejercicio 18");
        System.out.println("19. Ejercicio 19");
        System.out.println("20. Ejercicio 20");
        System.out.println("21. Ejercicio 21");
        System.out.println("22. Ejercicio 22");
        System.out.println("23. Ejercicio 23");
        System.out.println("24. Ejercicio 24");
        System.out.println("25. Ejercicio 25");
        System.out.println("26. Ejercicio 26");
        System.out.println("27. Ejercicio 27");
        System.out.println("28. Ejercicio 28");
        System.out.println("29. Ejercicio 29");
        System.out.println("30. Ejercicio 30");
        System.out.println("31. Ejercicio 31");
        System.out.println("32. Ejercicio 32");
        System.out.println("33. Ejercicio 33");
        System.out.println("34. Ejercicio 34");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.run();
                break;
            case 2:
                ejercicio2.run();
                break;
            case 3:
                ejercicio3.run();
                break;
            case 4:
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.run();
                break;
            case 5:
                Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.run();
                break;
            case 6:
                Ejercicio6 ejercicio6 = new Ejercicio6();
                ejercicio6.run();
                break;
            case 7:
                Ejercicio7 ejercicio7 = new Ejercicio7();
                ejercicio7.run();
                break;
            case 8:
                Ejercicio8 ejercicio8 = new Ejercicio8();
                ejercicio8.run();
                break;
            case 9:
                Ejercicio9 ejercicio9 = new Ejercicio9();
                ejercicio9.run();
                break;
            case 10:
                Ejercicio10 ejercicio10 = new Ejercicio10();
                ejercicio10.run();
                break;
            case 11:
                Ejercicio11 ejercicio11 = new Ejercicio11();
                ejercicio11.run();
                break;
            case 12:
                Ejercicio12 ejercicio12 = new Ejercicio12();
                ejercicio12.run();
                break;
            case 13:
                Ejercicio13 ejercicio13 = new Ejercicio13();
                ejercicio13.run();
                break;
            case 14:
                Ejercicio14 ejercicio14 = new Ejercicio14();
                ejercicio14.run();
                break;
            case 15:
                Ejercicio15 ejercicio15 = new Ejercicio15();
                ejercicio15.run();
                break;
            case 16:
                Ejercicio16 ejercicio16 = new Ejercicio16();
                ejercicio16.run();
                break;
            case 17:
                Ejercicio17 ejercicio17 = new Ejercicio17();
                ejercicio17.run();
                break;
            case 18:
                Ejercicio18 ejercicio18 = new Ejercicio18();
                ejercicio18.run();
                break;
            case 19:
                Ejercicio19 ejercicio19 = new Ejercicio19();
                ejercicio19.run();
                break;
            case 20:
                Ejercicio20 ejercicio20 = new Ejercicio20();
                ejercicio20.run();
                break;
            case 21:
                Ejercicio21 ejercicio21 = new Ejercicio21();
                ejercicio21.run();
                break;
            case 22:
                Ejercicio22 ejercicio22 = new Ejercicio22();
                ejercicio22.run();
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}