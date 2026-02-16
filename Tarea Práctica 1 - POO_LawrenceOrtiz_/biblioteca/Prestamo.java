import java.util.Date;

/*
 * Clase encargada de manejar el proceso de prestamo
 * entre un usuario y un libro del sistema.
 */
public class Prestamo {

    private Date fecha;
    private Usuario usuario;
    private libro libro;

    // Constructor que recibe el usuario y el libro a prestar
    public Prestamo(Usuario usuario, libro libro) {
        this.fecha = new Date(); // Se guarda la fecha actual
        this.usuario = usuario;
        this.libro = libro;
    }

    // Metodo que ejecuta la accion de prestar el libro
    public void registrarPrestamo() {

        // Se verifica si el libro esta disponible
        if (libro.consultarDisponibilidad()) {
            libro.prestarLibro();
            usuario.agregarLibro(libro);
            System.out.println("Prestamo realizado correctamente.");
        } else {
            System.out.println("El libro no esta disponible.");
        }
    }
}
