package herencia;

public class Perro  extends animal{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public String hacerSonido() {
        return "Guau";
    }

}
