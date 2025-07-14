package javaCourse.Enunciados;
// Un empelado desea alamecenar en un vecctor sus 12 sueldos del a;o. A partir de esto, nececita un programa que determine y muestre por pantalla la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el a;o

import java.util.*;

public class Enunciado4 {
    public static void main(String[] args) {
    double sueldos [] = new double[12];
    

    Scanner teclado = new Scanner(System.in);
    // indica al usuario los 12 sueldos
    for(int i= 0; i < sueldos.length; i++){
        sueldos[i] = teclado.nextDouble();
    }
    // Inicia una variable que almacenara todos los sueldos
    double sumaTotal= 0;
    // logica que alamacena los sueldos
    for (double sueldo : sueldos) {
        sumaTotal += sueldo;
    }
    // Logica que promedia el sueldo anual
    double promedio = sumaTotal / sueldos.length;

    System.out.println("Suma total anual " + sumaTotal);
    System.out.println("Promedio mensual " + promedio);

    teclado.close();

    }   
}
