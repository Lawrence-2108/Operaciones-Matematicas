
public class Plan {

    // Variables privadas del plan
    private int minutosIncluidos;
    private int datosGB;
    private double precioMensual;

    // Constructor que inicializa los valores del plan
    public Plan(int minutosIncluidos, int datosGB, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
    }

    // Metodos de acceso publico
    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    public int getDatosGB() {
        return datosGB;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }
}
