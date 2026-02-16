import java.util.ArrayList;

/*
 * Clase que modela a una persona registrada en la biblioteca.
 * Permite llevar control de los libros que tiene en prestamo.
 */
public class Usuario {

    private String nombre;
    private String idUnico;
    private ArrayList<libro> librosPrestados;

    // Constructor que inicializa los datos del usuario
    public Usuario(String nombre, String idUnico) {
        this.nombre = nombre;
        this.idUnico = idUnico;
        this.librosPrestados = new ArrayList<>();
    }

    // Metodo para agregar un libro a la lista de prestamos del usuario
    public void agregarLibro(libro libro) {
        librosPrestados.add(libro);
    }

    // Metodo para eliminar un libro cuando es devuelto
    public void devolverLibro(libro libro) {
        librosPrestados.remove(libro);
    }

    // Devuelve el nombre del usuario
    public String getNombre() {
        return nombre;
    }

    // Devuelve el identificador unico del usuario
    public String getIdUnico() {
        return idUnico;
    }
}
