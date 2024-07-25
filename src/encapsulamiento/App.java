package encapsulamiento;

public class App {
    public static void main(String[] args)  throws Exception {

        Persona persona1 = new Persona("Isaias", "Avila", 52 );

        persona1.setNombre("pedro");
        persona1.setApellido("picapiedra");


        System.out.println(persona1.darNombreCompleto() 
        + " tiene " + persona1.getEdad() + " de edad");
    }

   
}
