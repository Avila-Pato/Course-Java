package javaCourse.Bucles;
import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String  respuesta;

        System.out.println("Uso del for algunso ejemplo");
        for(int i = 1; i < 10; i ++ ){
            System.out.println(i);
        }

        System.out.println("Divisible por 2");
        for(int contador = 1; contador < 35; contador++ ){
            if (contador % 2 == 0) {
                // System.out.println(contador);
            }
        }
        System.out.println("Contador del 10 al 1");
        for(int rever = 10; rever > 0; rever--){ 
            // System.out.println(rever);      
        }

        System.out.println("Palarabs en pantalla");
        while (true) {
        System.out.println("Ingrese una palabra y desea termianr coloque (salir) ");
        respuesta = teclado.next();


        if (respuesta.equalsIgnoreCase("salir")) {
            break;
        }
            System.out.println("la letra es " + respuesta);
        }
            teclado.close();
            System.out.println("Terminado el programa");
    }
}
