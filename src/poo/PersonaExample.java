package poo;

public class PersonaExample {

    // Atributos (Estado/ caracteristica de un objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    // Metodos (Comportamiento de un objeto)

    public String darNombreCompleto() {
        return nombre + ", " + apellido;
    }

    public String enviarSaludo(String saludando) {
        if (edad > 40)
            return "Buenos dias Queridos" + saludando;

        return " Hola, Como andas" + saludando + "? ";
    }

}