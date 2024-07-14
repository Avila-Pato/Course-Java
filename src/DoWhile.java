public class DoWhile {
    public static void main(String[] args) {

        int contador = 5;

        do {
            System.out.println("esta condicion es antes");
            System.out.println(contador);

            contador++;
        } while (contador <= 6);
        System.out.println(contador);

    }

}
