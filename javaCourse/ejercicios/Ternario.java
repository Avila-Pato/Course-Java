import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el promedio del alumno");
        promedio = teclado.nextDouble();
        teclado.close();
        
        condicionFinal = (promedio >= 9) ? "Aprobado con distinción" :
                         (promedio >= 7) ? "Aprobado" :
                         "Reprobado";
        
        System.out.println(condicionFinal);
    }
}
