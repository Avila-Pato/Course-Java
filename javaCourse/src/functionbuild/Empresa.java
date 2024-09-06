package functionbuild;

public class Empresa {
    // Atributos (Estado/ característica de un objeto)
    String nombre;
    String ciudad;
    int edad;
    Rubro rubro;

    // Funcion Constructora
    public Empresa(String nombre, String ciudad, int edad, String nombreRubro) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;

        this.rubro = new Rubro();
        this.rubro.nombre = nombreRubro;
    }

    // Métodos (Comportamiento de un objeto)
    public String darNombreCompleto() {
        return nombre + ", " + ciudad;
    }

    public String enviarSaludo(String saludando) {
        if (edad > 40) {
            return "Buenos días queridos " + saludando;
        }
        return "Hola, ¿Cómo andas " + saludando + "?";
    }
}
