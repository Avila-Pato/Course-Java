package javaCourse.JavaPooTeoriaEjercicios;

public class Persona {
        public static void main(String[] args) {
            ModificadoresAcceso p = new ModificadoresAcceso("Isaias", "Avila", 52); 

            System.out.println(p.getNombre() + " " + p.getApellido() + " " + p.getEdad()); // Imprime "Isaias Avila 52"
            
            // o si quisiera crea otra modificacion suando el setter y el getter podria hacerlo de la siguiente manera

            p.setNombre("Pedro");
            p.setApellido("Picapiedra");
            p.setEdad(20);

            System.out.println(p.getNombre() + " " + p.getApellido() + " " + p.getEdad());

            


        }
}
