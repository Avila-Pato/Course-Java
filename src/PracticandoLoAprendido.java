
/**
 * PracticandoLoAprendido
 */
import java.util.Scanner;

public class PracticandoLoAprendido {

    public static void main(String[] args) {

        // Scanner permite que el usuario escriba

        try (Scanner scanner = new Scanner(System.in)) {
            // Declaraciones y asignaciones
            String palabraSecreta = "dios";
            int intentosMaximos = 10;
            int intentos = 0;
            boolean palabraAdivinada = false;

            // Arreglos
            char[] letrasAdivinadas = new char[palabraSecreta.length()];

            // Estrucuta de control: iterativa (bucle)
            for (int i = 0; i < letrasAdivinadas.length; i++) {
                letrasAdivinadas[i] = '_';
            }

            // Estrucuta de control iterativa 2 bucle

            while (!palabraAdivinada && intentos < intentosMaximos) {
                System.out.println("Palabras por adivinar: " + String.valueOf(letrasAdivinadas) + " "
                        + palabraSecreta.length() + " letras");

                System.out.println("Introduce una letra");

                // Class Scanner para pedir una letra
                char letra = Character.toLowerCase(scanner.next().charAt(0));

                boolean letraCorrecta = false;

                // Estrucuta de control iterativa 3 bucle

                for (int i = 0; i < letrasAdivinadas.length; i++) {
                    // Estrucuta de control Condicional
                    if (palabraSecreta.charAt(i) == letra) {
                        letrasAdivinadas[i] = letra;
                        letraCorrecta = true;
                    }
                }
                if (!letraCorrecta) {
                    intentos++;
                    System.out.println("!Incorrecto Te Quedan " + (intentosMaximos - intentos) + " intentos.");
                }

                if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                    palabraAdivinada = true;
                    System.out.println("!Felicidades! Has Adivinado la palabra Correcta: " + palabraSecreta);
                }
            }
            if (!palabraAdivinada) {
                System.out.println("!Que mal No has adivinado");
            }
            scanner.close();
        }
    }
}