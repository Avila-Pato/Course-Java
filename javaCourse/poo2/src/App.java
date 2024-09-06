import javaCourse.poo2.abstractInterface.MoustroMarino;

public class App {
    public static void main(String[] args) throws Exception {
        
        // // llamando las clases abstractas
        // Circulo circulo = new Circulo(5);
        // Rectangulo rectangulo = new Rectangulo(5, 10);

        // // imprimir el area de 1 forma
        // circulo.imprimirArea();
        // rectangulo.imprimirArea();

        // //Note otra forma de imprimir el area
        // System.out.println("El area del circulo es: " + circulo.calcularArea());
        // System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());


        // imprimiendo las interfaces
            MoustroMarino Caiman = new javaCourse.poo2.abstractInterface.Caiman("Rodolfo", 10);
            MoustroMarino Dragon = new javaCourse.poo2.abstractInterface.Dragon("DragonAcuatico");

            Caiman.alimentarse();
            Caiman.enviarMensaje();
            Caiman.atacar();
            
            Dragon.alimentarse();
            Dragon.enviarMensaje();
            Dragon.atacar();


            






    }
}
