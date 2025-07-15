package javaCourse.JavaPooTeoriaEjercicios;

public class ModificadoresAcceso {
// estos metodos son de acceco privado quiere decir que solo se puede acceder desde la propia clase
// de esta manera no se puede acceder desde otras clases y se tiene mas control sobre la informacion

    private String nombre;
    private String apellido;
    private int edad;
    

// lOs gettes and Setter son metodos que nos permiten acceder a los atributos de la clase y ala vez modificarlos
// de esta manera en el main podemos acceder a ellos
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


    // otro metodo que hay son los constructores
    public ModificadoresAcceso(String nombre, String apellido, int edad) {
    // asociacion this hace referenca a la propia clase osea a ModificadoresAcceso
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        System.out.println("El nombre es: " + this.nombre + " el apellido es: " + this.apellido + " y la edad es: " + this.edad);
        
    }
}
