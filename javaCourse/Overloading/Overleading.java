package javaCourse.Overloading;
public class Overleading {

    public static void main(String[] args) {
        int resultado = suma(12, 13, 34);
        int resultado2 = resta(43,23);
        System.out.println(resultado);
        System.out.println(resultado2);

        String pruebaTexto= texto();
        System.out.println(pruebaTexto);
    }

    static int suma(int a, int  b,int c){
        return a + b + c; 
    }

    static int resta(int a, int b){
        return a  - b;
    }

    static String texto(){
        return "Hola Mundo";
    }

}
