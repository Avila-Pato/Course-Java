package herencia;

public class animal {

    String nombre;
    int edad;
    static int numeroAnimales;

    public animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        numeroAnimales++;
    }


    public String hacerSonido() {
        return "WUAA!!";
    }

    public static int getNumeroAnimales() {
        return numeroAnimales;
    }

}
