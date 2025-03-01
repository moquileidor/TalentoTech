package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Libro> listaLibros = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    verTodosLosLibros();
                    break;
                case 4:
                    buscarLibro();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            if (opcion != 5) {
                System.out.println("\nPresione cualquier tecla para continuar...");
                scanner.nextLine();
            }
        } while (opcion != 5);
    }

    private void mostrarMenu() {
        System.out.println("\nMenú de Gestión de Libros");
        System.out.println("1. Agregar Libro");
        System.out.println("2. Eliminar Libro");
        System.out.println("3. Ver Todos los Libros");
        System.out.println("4. Buscar Libro");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void agregarLibro() {
        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el ISBN: ");
        String isbn = scanner.nextLine();

        listaLibros.add(new Libro(titulo, autor, isbn));
        System.out.println("Libro agregado exitosamente.");
    }

    private void eliminarLibro() {
        System.out.print("Ingrese el ISBN del libro a eliminar: ");
        String isbn = scanner.nextLine();
        boolean eliminado = listaLibros.removeIf(libro -> libro.getIsbn().equals(isbn));

        if (eliminado) {
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private void verTodosLosLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros en la lista.");
        } else {
            System.out.println("Lista de libros:");
            for (Libro libro : listaLibros) {
                System.out.println(libro);
            }
        }
    }

    private void buscarLibro() {
        System.out.print("Ingrese el título o el autor del libro a buscar: ");
        String consulta = scanner.nextLine().toLowerCase();
        boolean encontrado = false;

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().toLowerCase().contains(consulta) || libro.getAutor().toLowerCase().contains(consulta)) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron coincidencias.");
        }
    }
}
