package javaCourse.vectoresymatrices;
import  java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // int numeros [] = new int [5];        
        // numeros[0] = 32;
        // numeros[1] = 21;
        // numeros[2] = 49;
        // numeros[3] = 35;
        // numeros[4] = 87;

        // for(int i=0; i < numeros.length;i++ ) {
        //     System.out.println("El indice es " + i + " y el valor es " + numeros[i]);
        // }

        int numeros [] = new int[5];
        
        for(int i=0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        for(int i = 0; i < numeros.length;i++ ){
            System.out.println("El indice es " + i + " valor " + numeros[i]);
        }

    }
}
