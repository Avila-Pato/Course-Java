package javaCourse.Enunciados;
import java.util.*;

public class EnunciadoMatriz {
    public static void main(String[] args) {
        double notas[][] = new double[4][3];
        Scanner teclado = new Scanner(System.in);

        for(int f = 0; f < notas.length; f++) {
            for(int c = 0; c < notas[0].length; f++ ) { // notas[0].length indica que queremos acceder al primer array de la matriz notas
                // son 4 alumnos y 3 notas porque al usar notas[0].length indicamos que queremos acceder al primer array de la columna de la matriz
                System.out.println("Ingrese la nota " + (c + 1) + " del alumno " + (f + 1));
                notas[f][c] = teclado.nextDouble();
            }
        }
        // Calcular los promedio
        double promedio;
        for(int f = 0; f < notas.length; f++) {
            promedio = 0;
            for(int c = 0; c < notas[0].length; f++ ) {
                promedio += notas[f][c];
            }
            promedio /= notas[0].length;
            System.out.println("El promedio del alumno " + (f + 1) + " es " + promedio);
        }

         for(int f= 0; f < notas.length; f++) {
            for(int c=0; c < notas[0].length; c++) {
                System.out.println("La nota " + (c + 1) + " del alumno " + (f + 1) + " es " + notas[f][c]);
            }
        }
        
    }
    
    
  
}
