

public class CalculadoraS {

   
    // OPERACIONES CON DOS VALORES
    

    // Devuelve la suma de dos números enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Devuelve la diferencia entre dos números
    public int restar(int a, int b) {
        return a - b;
    }

    // Calcula el producto de dos valores
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Realiza la división entre dos números
    public int dividir(int a, int b) {
        return a / b;
    }

    // -------------------------------------------------
    // OPERACIONES CON TRES VALORES (Sobrecarga)
    // -------------------------------------------------

    // Suma tres números enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Resta tres números de manera consecutiva
    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    // Multiplica tres números
    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    // -------------------------------------------------
    // OPERACIONES CON CUATRO VALORES (Sobrecarga)
    // -------------------------------------------------

    // Suma cuatro cantidades
    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Resta cuatro cantidades en orden
    public int restar(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    // Multiplica cuatro valores enteros
    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }
}
