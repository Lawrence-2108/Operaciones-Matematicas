import java.util.ArrayList;
import java.util.Scanner;

public class MainBiblioteca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Coleccion donde se almacenan los libros del sistema
        ArrayList<libro> biblioteca = new ArrayList<>();

        biblioteca.add(new libro("La Sombra del Viento", "Carlos Ruiz Zafon", "101"));
        biblioteca.add(new libro("Los Juegos del Hambre", "Suzanne Collins", "102"));
        biblioteca.add(new libro("El Codigo Da Vinci", "Dan Brown", "103"));


        // Usuario que utilizara el sistema
        Usuario usuario = new Usuario("Carlos Perez", "U001");

        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1. Mostrar todos los libros");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar entrada pendiente

            switch (opcion) {

                case 1:
                    System.out.println("\n--- Lista general de libros ---");

                    // Recorrido para mostrar cada libro registrado
                    for (libro libro : biblioteca) {

                        System.out.print("Titulo: " + libro.getTitulo());

                        if (libro.consultarDisponibilidad()) {
                            System.out.println(" | Disponible");
                        } else {
                            System.out.println(" | Prestado");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el titulo del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();

                    boolean encontrado = false;

                    // Busqueda del libro dentro de la lista
                    for (libro libro : biblioteca) {

                        if (libro.getTitulo().equalsIgnoreCase(tituloPrestar)) {

                            encontrado = true;

                            if (libro.consultarDisponibilidad()) {

                                Prestamo prestamo = new Prestamo(usuario, libro);
                                prestamo.registrarPrestamo();

                            } else {
                                System.out.println("El libro ya esta prestado.");
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Libro no encontrado.");
                    }

                    break;

                case 3:
                    System.out.print("Ingrese el titulo del libro a devolver: ");
                    String tituloDevolver = scanner.nextLine();

                    boolean devuelto = false;

                    // Verificacion para realizar la devolucion
                    for (libro libro : biblioteca) {

                        if (libro.getTitulo().equalsIgnoreCase(tituloDevolver)) {

                            if (!libro.consultarDisponibilidad()) {

                                libro.devolverLibro();
                                usuario.devolverLibro(libro);
                                System.out.println("Libro devuelto correctamente.");
                                devuelto = true;

                            } else {
                                System.out.println("Ese libro ya estaba disponible.");
                                devuelto = true;
                            }
                        }
                    }

                    if (!devuelto) {
                        System.out.println("Libro no encontrado.");
                    }

                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}

