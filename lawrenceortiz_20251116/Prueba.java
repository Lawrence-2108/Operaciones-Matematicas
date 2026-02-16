
public class Prueba {

    public static void main(String[] args) {

        // Creación de tres objetos Tv
        TV tv1 = new TV();
        TV tv2 = new TV();
        TV tv3 = new TV();

        // ============================
        // Configuración TV 1
        // ============================
        tv1.marca = "Samsung";
        tv1.pulgadas = 55;
        tv1.volumen = 20;

        System.out.println("=== TV 1 ===");
        System.out.println("Marca: " + tv1.marca);
        System.out.println("Pulgadas: " + tv1.pulgadas);
        System.out.println("Volumen inicial: " + tv1.volumen);

        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();

        // ============================
        // Configuración TV 2
        // ============================
        tv2.marca = "LG";
        tv2.pulgadas = 43;
        tv2.volumen = 15;

        System.out.println("\n=== TV 2 ===");
        System.out.println("Marca: " + tv2.marca);
        System.out.println("Pulgadas: " + tv2.pulgadas);
        System.out.println("Volumen inicial: " + tv2.volumen);

        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();

        // ============================
        // Configuración TV 3
        // ============================
        tv3.marca = "Sony";
        tv3.pulgadas = 65;
        tv3.volumen = 25;

        System.out.println("\n=== TV 3 ===");
        System.out.println("Marca: " + tv3.marca);
        System.out.println("Pulgadas: " + tv3.pulgadas);
        System.out.println("Volumen inicial: " + tv3.volumen);

        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
    }
}


