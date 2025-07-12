package javaCourse.Calculadora.java;

public class Calculadora {

    public int dividir(int a, int b) throws CalculadoraException {
    
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        if (b == 0) {
            throw new CalculadoraException("Error: No se puede dividir entre cero", "División por cero");
        }
        return a / b;
    }
}
