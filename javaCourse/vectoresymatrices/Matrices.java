package javaCourse.vectoresymatrices;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int matriz [][] = new int[3][3];
        Scanner teclado = new Scanner(System.in);

        for(int f = 0; f < matriz.length; f++) {
            for(int c = 0; c < matriz.length; c++) {
                System.out.println("Ingrese el valor de la fila " + f + " y la columna " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }

        for(int f=0; f < 3; f++){
            for(int c= 0; c < 3; c++){
                System.out.println("Fila " + f + " Columna " + c + " = " + matriz[f][c]);
            }
            teclado.close();
        }

    }
}
