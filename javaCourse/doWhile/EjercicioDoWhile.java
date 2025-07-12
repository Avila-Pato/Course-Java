package javaCourse.doWhile;


import java.util.Scanner;

public class EjercicioDoWhile {
    public static void main(String[] args) {

    boolean bandera = true;

    Scanner teclado = new Scanner(System.in);
    String respuesta;
    
    while ( bandera == true) {
        System.out.println("El valor de mi bandera es " + bandera);
        System.out.println("Suscrito ?" + bandera);

        System.out.println("Do you want to subscribe? ");
        respuesta = teclado.next();

        if(respuesta.equalsIgnoreCase("si")) {
            System.out.println("bye ");
            bandera = false;
        } 
        System.out.println("------------------------------------");

        
    }
    }
}

