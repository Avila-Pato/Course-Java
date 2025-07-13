package javaCourse.Enunciados;
// Realizar un programa que permita la carga de 15 numeros en un vector. una vez cargados. se nececita que el programa cuente e informe por pantalla cuantas veces se cargo el numero 3

import java.util.*;
public class Enunciado3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int numeros [] = new int[15];

        for(int i = 0; i < numeros.length; i++ ){
            numeros[i] = teclado.nextInt();
        } 
        // Sintaxis for Each en java se lee "Pr cada" p "Para cada " elemento dentro de la collecion o arreglo
        //Indica que se recorre cada elemento de la collecion 1 a 1
        // Crea una nueva variable int y itera pro cada elemento con al condicion si es igual a 3 se agregara a un contador
        for(int num : numeros){
            if (num == 3) {
                contador++;
            }

        }

        for(int i = 0; i < numeros.length; i++ ){
            System.out.println("El indice es " + i + " Numero " + numeros[i]);
            System.out.println("El numero 3 se repita " + contador + " Veces");
        }
        teclado.close();

    }
    
}
