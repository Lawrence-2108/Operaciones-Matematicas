
public class Factura {

    // Datos principales para el calculo
    private Cliente cliente;
    private int minutosConsumidos;
    private int datosConsumidos;

    // Valores fijos por consumo adicional
    private static final double COSTO_MINUTO_EXTRA = 0.10;
    private static final double COSTO_GB_EXTRA = 5.0;

    // Constructor que recibe cliente y consumo mensual
    public Factura(Cliente cliente, int minutosConsumidos, int datosConsumidos) {
        this.cliente = cliente;
        this.minutosConsumidos = minutosConsumidos;
        this.datosConsumidos = datosConsumidos;
    }

    // Calcula el monto final sumando precio base y posibles extras
    public double calcularTotal() {

        Plan plan = cliente.getPlan();
        double total = plan.getPrecioMensual();
        double cargosExtras = 0;

        // Verifica si hay minutos adicionales
        if (minutosConsumidos > plan.getMinutosIncluidos()) {
            int minutosExtra = minutosConsumidos - plan.getMinutosIncluidos();
            cargosExtras += minutosExtra * COSTO_MINUTO_EXTRA;
        }

        // Verifica si hay datos adicionales
        if (datosConsumidos > plan.getDatosGB()) {
            int datosExtra = datosConsumidos - plan.getDatosGB();
            cargosExtras += datosExtra * COSTO_GB_EXTRA;
        }

        return total + cargosExtras;
    }

    // Imprime en pantalla el detalle completo de la factura
    public void generarFactura() {

        Plan plan = cliente.getPlan();

        System.out.println("\n===== FACTURA MENSUAL =====");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Numero: " + cliente.getNumeroTelefonico());
        System.out.println("Plan contratado:");
        System.out.println("  Minutos incluidos: " + plan.getMinutosIncluidos());
        System.out.println("  Datos incluidos (GB): " + plan.getDatosGB());
        System.out.println("  Precio base: $" + plan.getPrecioMensual());

        System.out.println("\nConsumo del mes:");
        System.out.println("  Minutos usados: " + minutosConsumidos);
        System.out.println("  Datos usados (GB): " + datosConsumidos);

        System.out.println("\nTOTAL A PAGAR: $" + calcularTotal());
    }
}
