package poo;

public class PersonaPoo {

    public static void main(String[] args) {

        PersonaExample persona1 = new PersonaExample();
        persona1.nombre = "Isaias";
        persona1.apellido = "Avila";
        persona1.edad = 5;

        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Analista Programdor";
        carrera1.duracion = 2.5;
        carrera1.enCurso = true;

        // Agregar la carrera a persona1
        persona1.carrera = carrera1;

        PersonaExample persona2 = new PersonaExample();
        persona2.nombre = "Maicol";
        persona2.apellido = "Avila";
        persona2.edad = 25;

        Carrera carrera2 = new Carrera();
        carrera2.nombre = "Ingienero  en sistemas";
        carrera2.duracion = 6;
        carrera2.enCurso = false;

        persona2.carrera = carrera2;

        String saludando = " Patricio avila";

        // Clase orientada a objeto simplifica el codigoo
        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " de edad y esta recibido de "
                + persona1.carrera.nombre);

        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " de edad y esta recibido de "
                + persona2.carrera.nombre);

        System.out.println(persona1.enviarSaludo(saludando));
        System.out.println(persona1.enviarSaludo(" chavo del 8"));

        // System.out.println(persona1.nombre + ", " + persona1.apellido + " tiene " +
        // persona1.edad + " de edad");
        // System.out.println(persona2.nombre + ", " + persona2.apellido + " tiene " +
        // persona2.edad + " de edad");
    }
}