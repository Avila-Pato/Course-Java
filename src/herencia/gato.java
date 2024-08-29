package herencia;

// con extends heredamos los atributos de la clase animal
public class gato extends animal{

    public gato(String nombre, int edad) {
        // con la palara super heredamos los atributos

        super(nombre, edad );
    }
    // con la palabra override sobreescribimos el 
    //metodo de la clase padre
    @Override
    public String hacerSonido() {
        return "Miau";
    }
}
