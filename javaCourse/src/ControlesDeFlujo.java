public class ControlesDeFlujo {

    public static void main(String[] args) {

        int i;

        for (i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 2) {
                continue;
            }
            System.err.println(i);

        }

        for (int j = 0; i < 10; i++) {
            if (j == 5) {
                break; // Saldrá del bucle cuando i sea igual a 5
            }
            System.out.println(i);
        }
        // Salida: 0 1 2 3 4

    }

}