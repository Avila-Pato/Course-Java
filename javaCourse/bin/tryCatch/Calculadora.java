package javaCourse.bin.tryCatch;

public class Calculadora {
    public int dividir(int a, int b) throws CalculadoraException {
        if (b == 0) {
            throw new CalculadoraException("Error: No se puede dividir entre cero", "División por cero");
        }
        return a / b;
    }
}
