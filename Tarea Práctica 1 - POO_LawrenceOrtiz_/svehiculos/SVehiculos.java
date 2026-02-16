
public class SVehiculos {

    // Variables privadas del vehiculo
    private String placa;
    private String marca;
    private String modelo;

    // Constructor sin parametros
    public SVehiculos() {
        this.placa = "0000-XXX";
        this.marca = "Generica";
        this.modelo = "Base";
    }

    // Constructor que recibe solo la placa
    public SVehiculos(String placa) {
        this.placa = placa;
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    // Constructor que inicializa todos los atributos
    public SVehiculos(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodos de acceso publico
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Calcula un mantenimiento basico segun kilometros
    public double calcularMantenimiento(int kilometros) {
        return kilometros * 0.05;
    }

    // Calcula mantenimiento considerando tipo de servicio
    public double calcularMantenimiento(int kilometros, String tipoServicio) {

        double costoBase = kilometros * 0.05;

        if (tipoServicio.equalsIgnoreCase("premium")) {
            costoBase += 150;
        }

        return costoBase;
    }

    // Calcula mantenimiento incluyendo opcion de repuestos originales
    public double calcularMantenimiento(int kilometros, String tipoServicio, boolean repuestosOriginales) {

        double costo = calcularMantenimiento(kilometros, tipoServicio);

        if (repuestosOriginales) {
            costo += 300;
        }

        return costo;
    }
}
