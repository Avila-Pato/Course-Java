public abstract class  Figura {

    //Este comportamiento sera obligatorio en las clases qiue heredan la clase Figura
    abstract double calcularArea();

    void imprimirArea(){
        System.out.println("El area es: " + calcularArea());
    }
}
