import java.util.Scanner;

public class Merceria {

    public static void main(String[] args) {
        
        int cantidadPaquetes;
        double montoTotal, diferencia, descuento, totalConDescuento;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de paquetes:");
        cantidadPaquetes = teclado.nextInt();
        teclado.close();

        // posibles casos

        if (cantidadPaquetes < 5) {
            if (cantidadPaquetes < 0) {
                System.out.println("La cantidad de paquetes no puede ser negativa");
            } else {
                System.out.println("No se permiten ventas minoristas (cantidad de paqutes menor a 5)");
            }
        } else {
            System.out.println("Ingrese el monto total de la compra");
            teclado = new Scanner(System.in);
            montoTotal = teclado.nextDouble();

            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 100 por lo que no se posee las promociones. Nececita comprar" + diferencia + "USD para entrar en la promo");
            } else {
                if (montoTotal >= 100 && montoTotal <= 300) {
                    descuento = montoTotal * 0.05;
                    totalConDescuento = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 5% que equivale a: " + descuento
                            + " El monto total con descuento es de: " + totalConDescuento);
                } else {
                    descuento = montoTotal * 0.10;
                    totalConDescuento = montoTotal - descuento;
                     System.out.println("Por su compra tiene un descuento del 10% que equivale a: " + descuento
                            + " El monto total con descuento es de: " + totalConDescuento);
                }
            }
        }

        
    }
}
