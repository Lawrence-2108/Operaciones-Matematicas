
public class libro {

    // Variables internas del libro
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    // Constructor que inicializa los datos principales
    public libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // El libro inicia como disponible
    }

    // Retorna true o false segun el estado del libro
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    // Cambia el estado del libro a no disponible
    public void prestarLibro() {
        if (disponible) {
            disponible = false;
        }
    }

    // Restablece el estado del libro a disponible
    public void devolverLibro() {
        disponible = true;
    }

    // Metodos de acceso para obtener los datos del libro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
