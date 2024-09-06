package encapsulamiento;

public class Persona {

    // Atributos (Estado/ caracteristica de un objeto)
   private String nombre;
   private String apellido;
   private int edad;
   

    // Crete a constructor (Metodo que se ejecuta cuando se crea un objeto) 
    public Persona(String nombre,  String apellido,  int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
  

    // Metodos (Comportamiento de un objeto)

    public String darNombreCompleto() {
        return getApellido() + ", " + getNombre();
    }

    public String enviarSaludo(String saludando) {
        if (edad > 40)
            return "Buenos dias Queridos" + saludando;

        return " Hola, Como andas" + saludando + "? ";
    }


    //GETTERS y SETTERS (Metodos que se ejecutan cuando se modifican los atributos)

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

  
}