public class ArreglosMatricesVectores {
    public static void main(String[] args) {

        // Los valores se destribuyen en la memoria y se pueden acceder a ellos a traves
        // de un indice

        // Los Arraglos tambien son llamados vectores o matrices

        int[] numeros = { 1, 2, 3, 4, 5 };

        // Uso del bucle for-each
        for (int numero : numeros) {
            System.out.println(numero);
        }

        int[] numbers = { 1, 2, 3, 4, 5 };

        // Uso del bucle for con índice
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Índice " + i + ": " + numbers[i]);
        }

        // Bucle ForIn
        int[] examples = new int[5];
        examples[0] = 10;
        examples[1] = 20;
        examples[2] = 30;
        examples[3] = 40;
        examples[4] = 50;

        for (int index = 0; index < examples.length; index++) {
            System.out.println(examples[index]);

        }

    }

}
