package javaCourse.bin.tryCatch;

public class EjemploTryCatch {
    public static void main(String[] args) {
        try {
            // Código que puede causar una excepción
            int resultado = 10 / 0; // Esto lanzará ArithmeticException
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción
            System.out.println("Error: No se puede dividir entre cero.");
        } finally {
            // Código que siempre se ejecuta
            System.out.println("Bloque finally ejecutado.");
        }
    }
}
