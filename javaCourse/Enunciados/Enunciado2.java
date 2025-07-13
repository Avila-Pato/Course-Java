package javaCourse.Enunciados;
import java.util.Arrays;
import java.util.*;
// Realizar u programa que eprmita la carga de 10 numeros en un vector una vez cargados se encecita que el programa determine cual es el mayor y menor de ellos
public class Enunciado2 {
    public static void main(String[] args) {
        int numeros [] = new int[10];
        int max = numeros[0];
        int min = numeros[0];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        for(int i = 0; i < numeros.length;i++ ){
            // System.out.println("Indice es " + i + " Numero es " + numeros[i]);
            // Arrays.sort(numeros);
            // System.err.println(Arrays.toString(numeros));
            // System.out.println("Menor " + numeros[0]);
            // System.out.println("Mayor " + numeros[9]);

            if(numeros[i] > max ) max = numeros[i];
            if (numeros[i] < min ) min = numeros[i];

            System.err.println("Mayor: " + max);
            System.err.println("Menor: " + min);


        }

    }
    
}
