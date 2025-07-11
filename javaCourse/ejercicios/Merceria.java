import java.util.Scanner;

public class Merceria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidadPaquetes;
        double montoTotal;

        System.out.println("Ingrese la cantidad de paquetes:");
        cantidadPaquetes = teclado.nextInt();

        if (cantidadPaquetes < 5) {
            System.out.println("No se permiten ventas menores a 5");
        } else if (cantidadPaquetes >= 5 && cantidadPaquetes <= 15) {
            System.out.println("El costo de envío es de 10 USD");
        } else {
            System.out.println("Usted no tiene costo de envío. Muchas gracias por su compra");
        }

        System.out.println("Ingrese el monto total de la compra:");
        montoTotal = teclado.nextDouble();

        teclado.close();

        System.out.println("Resumen:");
        System.out.println("Cantidad de paquetes: " + cantidadPaquetes);
        System.out.println("Monto total: $" + montoTotal);
    }
}
