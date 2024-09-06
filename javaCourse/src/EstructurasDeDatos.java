import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class EstructurasDeDatos {

    public static void main(String[] args) {
        String imagePath = "../lib/img/EstructuraDatos.png"; // Ruta de la imagen

        BufferedImage imagen = cargarImagen(imagePath); // Cargar la imagen desde el archivo

        if (imagen != null) {
            System.out.println("¡Imagen cargada correctamente!");

            // Aquí puedes procesar la imagen como lo necesites
            // Por ejemplo, mostrarla en un componente gráfico, procesar sus píxeles, etc.
        } else {
            System.out.println("Error al cargar la imagen.");
        }
    }

    // Método para cargar una imagen desde un archivo dado su path
    public static BufferedImage cargarImagen(String imagePath) {
        BufferedImage imagen = null;
        try {
            File file = new File(imagePath);
            imagen = ImageIO.read(file);
        } catch (IOException e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
        return imagen;
    }
}
