package herencia;

public class App {

    public static void main(String[] args) throws Exception {

      animal animal = new animal("Bestia", 522);
      animal perro = new Perro("Firulais", 32);
      animal gato = new gato("Michi", 21);

      
      System.out.println("El animal llamado " + animal.nombre + "tiene " + animal.edad + " años");
      System.out.println(animal.hacerSonido());
      System.out.println("El perro llamado " + perro.nombre + "tiene " + perro.edad + " años");
      System.out.println(perro.hacerSonido());
      System.out.println("El gato llamado " + gato.nombre + "tiene " + gato.edad + " años");
      System.out.println(gato.hacerSonido());
      // como es una variable estatica no se puede llamar con un objeto es minuscula y la clase es mayuscula
      System.out.println("El numero de animales es: " + herencia.animal.getNumeroAnimales());
    }
    
}
