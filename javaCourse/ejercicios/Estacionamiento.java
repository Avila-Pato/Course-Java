import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalHora = 0;
        int totalMediaJornada = 0;
        int totalJornadaCompleta = 0;
        double totalGanancias = 0;

        while (true) {
            System.out.println("Ingrese la patente del vehículo. Para terminar escriba 'Fin':");
            String patente = teclado.next();

            if (patente.equalsIgnoreCase("Fin")) {
                break;
            }

            System.out.println("*********** Tipos de Estacionamiento ************");
            System.out.println(
                "1) 1 hora (3$ USD por hora)\n" +
                "2) Media jornada (15$ USD total)\n" +
                "3) Jornada completa (30$ USD con 10% de descuento)"
            );

            String opcion = teclado.next();

            switch (opcion) {
                case "1":
                    totalHora++;
                    totalGanancias += 3;
                    System.out.println("Estacionamiento por 1 hora registrado. Total a pagar: $3");
                    break;

                case "2":
                    totalMediaJornada++;
                    totalGanancias += 15;
                    System.out.println("Estacionamiento por media jornada registrado. Total a pagar: $15");
                    break;

                case "3":
                    totalJornadaCompleta++;
                    double descuento = 30 * 0.10;
                    double totalPagar = 30 - descuento;
                    totalGanancias += totalPagar;
                    System.out.printf("Jornada completa registrada. Descuento: $%.2f, Total a pagar: $%.2f%n", descuento, totalPagar);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        teclado.close();

        // Mostrar resultados finales
        System.out.println("\n*********** RESUMEN DEL DÍA ************");
        System.out.println("Cantidad total de estacionamientos por hora: " + totalHora);
        System.out.println("Cantidad total de estacionamientos de media jornada: " + totalMediaJornada);
        System.out.println("Cantidad total de estacionamientos de jornada completa: " + totalJornadaCompleta);
        System.out.printf("Suma total de ingresos en USD: $%.2f%n", totalGanancias);
        System.out.println("Programa terminado.");
    }
}
