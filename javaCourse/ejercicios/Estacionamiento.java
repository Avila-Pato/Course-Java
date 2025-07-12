//un administrador de un estacionamineto nececita un programa quepermite el total a pagar de varios clientes

// El programa debe solicitar por teclado los datos
// La patente del vehiculo
// el tipo de estacionamiento

// los tipos de estacioanmiento son 3

// por 1 hora (3$ uds por hora)
// media jornada (15$ uds total)
// jornada completa (30$ y posee 10% de descuento )

// El programa debe calcular el monto a pagar para cada cliente en funcion del tipo de estacionamiento seleccionado. la carga de datos debe continuar hasta qyue el usuario ingrese la palabra Fin en lugar de la patente

//se debe mostrar en pantllla

// La cantidad total de estacionamientos por hora
// la cantidad total de estacionamientos de media jornada
// la cantidad total de estacionamientos de jornada completa
// la suma total de ingresos en USD que hubo durante el dia
import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        ArrayList<String> patentes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese la patente del vehículo. Para terminar escriba 'salir':");
            String patente = teclado.next();

            if (patente.equalsIgnoreCase("salir")) {
                break;
            }

            patentes.add(patente);
            System.out.println("Patentes registradas: " + patentes);

            System.out.println("*********** Precio de Estacionamientos ************");
            System.out.println(
                "1) 1 hora (3$ USD por hora)\n" +
                "2) Media jornada (15$ USD total)\n" +
                "3) Jornada completa (30$ USD con 10% de descuento)"
            );

            String opcion = teclado.next();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese su dinero:");
                    int dinero1 = teclado.nextInt();
                    if (dinero1 >= 3) {
                        System.out.println("1 hora agregada.");
                    } else {
                        System.out.println("Monto insuficiente.");
                    }
                    break;

                case "2":
                    System.out.println("Ingrese su dinero:");
                    int dinero2 = teclado.nextInt();
                    if (dinero2 >= 15) {
                        System.out.println("Media jornada agregada.");
                    } else {
                        System.out.println("Monto insuficiente.");
                    }
                    break;

                case "3":
                    System.out.println("Ingrese su dinero:");
                    int dinero3 = teclado.nextInt();
                    if (dinero3 >= 30) {
                        double descuento = 30 * 0.10;
                        double totalPagar = 30 - descuento;
                        System.out.println("Jornada completa agregada. Descuento aplicado: $" + descuento);
                        System.out.println("Total a pagar: $" + totalPagar);
                    } else {
                        System.out.println("Monto insuficiente.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        teclado.close();
        System.out.println("Programa terminado.");
    }
}
