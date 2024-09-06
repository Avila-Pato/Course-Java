public class App {
    public static void main(String[] args) throws Exception {

        /*
         * VARIABLES
         * Es un espacio de memoria que tiene un nombre asociado uy puede contener un valor cambiente
         * DECLARACION
         * Asigna el tipo de dato y el nombre de la variable sin darle un valor inicial
         * DEFINICION
         * Asignar el tipo de dato y el nombre de la varible dandole o no un valor inicial
         * ASIGNACION
         * Darle un valor a la variable ya declarada         
         */ 

                int a = 3;
                int b = 4;
                // Operadores Aritméticos
                int suma = a + b;
                int resta = a - b;
                int multiplicacion = a * b;
                int division = a / b;
                int modulo = a % b;
        
                // Operadores Relacionales
                boolean igual = (a == b);
                boolean diferente = (a != b);
                boolean mayor = (a > b);
                boolean menor = (a < b);
                boolean mayorOIgual = (a >= b);
                boolean menorOIgual = (a <= b);
        
                // Operadores Condicionales (Lógicos)
                boolean andLogico = (a > 1 && b < 5);
                boolean orLogico = (a < 1 || b > 1);
                boolean notLogico = !(a == b);
        
                // Operador Condicional (Ternario)
                int max = (a > b) ? a : b;

                // float Or Double
                double decimales = 5.22132434234234234234234234234;

                // TIPO DE DATO CHARACTER
                char letra = 'P';

                String cadena = "Epic moment 2024/07/10";
        
                // Mostrar resultados
                System.out.println("Suma: " + suma);
                System.out.println("Resta: " + resta);
                System.out.println("Multiplicación: " + multiplicacion);
                System.out.println("División: " + division);
                System.out.println("Módulo: " + modulo);
                System.out.println("Igual a: " + igual);
                System.out.println("Diferente de: " + diferente);
                System.out.println("Mayor que: " + mayor);
                System.out.println("Menor que: " + menor);
                System.out.println("Mayor o igual que: " + mayorOIgual);
                System.out.println("Menor o igual que: " + menorOIgual);
                System.out.println("AND Lógico: " + andLogico);
                System.out.println("OR Lógico: " + orLogico);
                System.out.println("NOT Lógico: " + notLogico);
                System.out.println("Máximo: " + max);
                System.err.println("decimales" + decimales);
                System.err.println("letra " + letra);
                System.err.println("cadena " + cadena);
        
        
    }
}
