package poo;

public class PersonaExample {

    // Atributos (Estado/ caracteristica de un objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;




    // Crete a constructor (Metodo que se ejecuta cuando se crea un objeto) 
    public PersonaExample(String nombre, int edad,  String apellido, String nombreCarrera, int duracionCarrera,
        boolean estaCursando) {

        carrera = new Carrera(nombreCarrera, duracionCarrera, estaCursando);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //Sobrecarga del constructor

    public PersonaExample(String nombre, String apellido, int edad, String nombreCarrera) {
        carrera = new Carrera(nombreCarrera);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }



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