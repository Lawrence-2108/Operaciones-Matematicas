

public class TV {

    // Propiedades del televisor
    public String marca;
    public int pulgadas;
    public boolean encendido;
    public int volumen;

    // Método que activa el televisor
    public void encender() {
        encendido = true;
        System.out.println("La TV se esta encendiendo...");
    }

    // Método que apaga el televisor
    public void apagar() {
        encendido = false;
        System.out.println("La TV se esta apagando...");
    }

    // Método para incrementar el nivel de sonido
    public void subirVolumen() {
        volumen++;
        System.out.println("Subiendo el volumen...");
    }

    // Método para disminuir el nivel de sonido
    public void bajarVolumen() {
        volumen--;
        System.out.println("Bajando el volumen...");
    }
}
