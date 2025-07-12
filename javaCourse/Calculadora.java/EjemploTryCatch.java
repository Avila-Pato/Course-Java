package javaCourse.Calculadora.java;

public class EjemploTryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 5; // Cambia esto a 5 para una división válida
        int resultado;

        Calculadora calculadora = new Calculadora();

        try {
            resultado = calculadora.dividir(a, b);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (CalculadoraException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bloque finally ejecutado.");
        }
    }
}
