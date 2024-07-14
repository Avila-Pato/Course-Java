public class Return {

    public static void main(String[] args) {
        System.out.println(encontrarMayor(1, 15)); // Llamada a la función encontrarMayor
    }

    public static int encontrarMayor(int a, int b) {
        if (a > b) {
            return a; // Devuelve a si es mayor que b
        } else {
            return b; // Devuelve b si es mayor o igual a a
        }
    }
}
