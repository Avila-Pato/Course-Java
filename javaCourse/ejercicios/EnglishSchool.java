import java.util.Scanner;

public class EnglishSchool {
            public static void main(String[] args) {
            int edad;
            Scanner teclado = new Scanner(System.in);

            System.err.println("Bienvenido a la Escuela Inglesa");
            System.out.println("Ingresa la edad del alumno");
            
            edad = teclado.nextInt();
            
            teclado.close();


            if(edad >= 4 && edad <= 6){
                System.out.println("El Horario del grupo A es de 8:00 a 10:00");
            }
            else if(edad >= 7 && edad <= 9){
                System.out.println("El Horario del grupo B es de 8:00 a 10:00");
            }
            else if(edad >= 10 && edad <= 12){
                System.out.println("El Horario del grupo C es de 8:00 a 10:00");
            }
            else if(edad >= 13 && edad <= 15){
                System.out.println("El Horario del grupo D es de 8:00 a 10:00");
            }
            else{
                System.out.println("El Horario del grupo E es de 8:00 a 10:00");
            }
        }
}
