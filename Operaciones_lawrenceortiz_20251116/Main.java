// =====================================================
// Clase principal encargada de verificar el funcionamiento
// de la clase CalculadoraS.
// =====================================================

public class Main {

    public static void main(String[] args) {

        // Se crea una instancia de la calculadora
        CalculadoraS calc = new CalculadoraS();

        // ----------- Operaciones con dos números -----------
        System.out.println("Resultado suma (2 valores): " + calc.sumar(5, 3));
        System.out.println("Resultado resta (2 valores): " + calc.restar(10, 4));
        System.out.println("Resultado multiplicacion (2 valores): " + calc.multiplicar(6, 7));
        System.out.println("Resultado division (2 valores): " + calc.dividir(20, 4));

        // ----------- Operaciones con tres números -----------
        System.out.println("Resultado suma (3 valores): " + calc.sumar(5, 3, 2));
        System.out.println("Resultado resta (3 valores): " + calc.restar(10, 4, 2));
        System.out.println("Resultado multiplicacion (3 valores): " + calc.multiplicar(2, 3, 4));

        // ----------- Operaciones con cuatro números -----------
        System.out.println("Resultado suma (4 valores): " + calc.sumar(1, 2, 3, 4));
        System.out.println("Resultado resta (4 valores): " + calc.restar(20, 5, 3, 2));
        System.out.println("Resultado multiplicacion (4 valores): " + calc.multiplicar(2, 2, 2, 2));
    }
}
