
public class Cliente {

    // Atributos privados del cliente
    private String nombre;
    private String numeroTelefonico;
    private Plan plan;

    // Constructor que inicializa los datos del cliente
    public Cliente(String nombre, String numeroTelefonico, Plan plan) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }

    // Metodos de acceso publico
    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public Plan getPlan() {
        return plan;
    }
}
