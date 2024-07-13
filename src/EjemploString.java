

public class EjemploString {

    public static void main(String[] args) throws Exception {
    
        String texto = "Texto asignado a una variable string    ";
        System.out.println(texto);

        int longitud = texto.length();
        System.err.println(longitud);

        char character = texto.charAt(3);
        System.err.println(character);

        String subString = texto.substring(6, 14);
        System.err.println(subString);

        String minuscula = texto.toLowerCase();
        System.err.println(minuscula);

        String mayuscula= texto.toUpperCase();
        System.err.println(mayuscula);

        int indice = texto.indexOf("asignado");
        System.err.println(indice);

        String reemplazado = texto.replace("Texto", "parrafo");
        System.err.println(reemplazado);

        boolean contiene = texto.contains("asignado");
        System.err.println("Tiene la palabra asignado ? " + contiene);

        String texto2 = "contenedor de testo separados  ";
        String sinEspacios = texto2.trim();
        System.err.println(sinEspacios);

        String texto3 = "Java Python C++ JavaScript";
        String[] partes = texto3.split("\\s+");

        for(String parte : partes) {
            System.err.println(parte);
        }
        String texto4 = "Java,Python,C++,JavaScript";
        String[] partesEnComa = texto4.split(",");

        for(String parteComa : partesEnComa) {
            System.err.println(parteComa);
        }
    }
}
