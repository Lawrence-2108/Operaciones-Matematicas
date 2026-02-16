import java.util.Scanner;

/*
 * Clase que ejecuta el programa principal
 * para simular el sistema de telefonia.
 */
public class MainTelefonia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE FACTURACION TELEFONICA ===");

        // Se crea un plan base con limites definidos
        Plan planBasico = new Plan(500, 10, 25.0);

        // Se registra un cliente con su plan asignado
        Cliente cliente = new Cliente("Ana Lopez", "809-000-0000", planBasico);

        // Se solicita el consumo mensual al usuario
        System.out.print("Ingrese minutos consumidos: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese datos consumidos (GB): ");
        int datos = scanner.nextInt();

        // Se genera la factura con el consumo ingresado
        Factura factura = new Factura(cliente, minutos, datos);

        // Se muestra el resumen final en pantalla
        factura.generarFactura();

        scanner.close();
    }
}
