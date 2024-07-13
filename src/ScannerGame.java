import java.util.Scanner;

public class ScannerGame{
    public static void main(String[] args) throws Exception {


        Scanner ScannerEjemplo = new Scanner(System.in);

        System.out.println("Bienivenido Que Bebida desea llevar");
        System.out.println(" Elige unas de las siguientes Opciones: ");
        System.out.println("1 - Cafe");
        System.out.println("2 - Vino");
        System.out.println("3 - Mate");
        System.out.println("4 - Coca-Cola");
            
        int opcion = ScannerEjemplo.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Buenisomo el cafe");
                break;
            case 2:
                System.out.println("Que elegancia la de Francia");
                break;
            case 3:
                System.out.println("Sos Argentino Che?");
                break;
            case 4:
                System.out.println("Este es de mi barrio");
                break;

            default:

                System.out.println("Opcion No valida!");
                break;
        }

        if ( opcion == 2) {
            System.out.println("Disfrute del vino");

            
        }
        if ( opcion <= 4  ) {

            System.out.println("!Disfrute de su bebida!");
            
        }
        ScannerEjemplo.close();
        
    }
    
}
