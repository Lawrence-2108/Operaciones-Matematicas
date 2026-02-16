import java.util.Scanner;

/*
 * Clase principal que ejecuta y prueba
 * el funcionamiento del sistema de vehiculos.
 */
public class MainVehiculo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE VEHICULOS ===");

        // Se crea un objeto utilizando el constructor completo
        SVehiculos vehiculo = new SVehiculos("A123BC", "Toyota", "Corolla");

        System.out.println("Vehiculo creado:");
        System.out.println("Placa: " + vehiculo.getPlaca());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());

        // Solicitud de kilometros recorridos
        System.out.print("\nIngrese kilometros recorridos: ");
        int km = scanner.nextInt();
        scanner.nextLine();

        // Seleccion del tipo de servicio
        System.out.println("Seleccione tipo de servicio:");
        System.out.println("1. Basico");
        System.out.println("2. Premium");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        String tipoServicio = (opcion == 2) ? "premium" : "basico";

        // Pregunta sobre uso de repuestos originales
        System.out.print("Desea repuestos originales? (true/false): ");
        boolean repuestos = scanner.nextBoolean();

        double costo;

        // Se calcula el costo dependiendo de la opcion elegida
        if (repuestos) {
            costo = vehiculo.calcularMantenimiento(km, tipoServicio, true);
        } else {
            costo = vehiculo.calcularMantenimiento(km, tipoServicio);
        }

        System.out.println("\nCosto estimado de mantenimiento: $" + costo);

        scanner.close();
    }
}
