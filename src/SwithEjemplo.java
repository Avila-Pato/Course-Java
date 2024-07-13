public class SwithEjemplo {
    public static void main(String[] args) {

        // Que Bebida te gusta ?

        String Bebida = "Cafe";

        switch (Bebida) {
            case "Cafe":
                System.out.println("Buenisomo el cafe");
                break;
            case "Vino":
                System.out.println("Wue elegancia la de Francia");
                break;
            case "Mate":
                System.out.println("Sos Argentino Che?");
                break;
            case "Coca-Cola":
                System.out.println("Este es de mi barrio");
                break;

            default:

                System.out.println("agua con hielo");
                break;
        }

        // if (Bebida = "Cafe") {
        //     System.out.println("Buenisomo el cafe");
        // } else if (Bebida = "Mate") {
        //     System.out.println("Sos Argentino Che?");
        // } else if (Bebida = "Vino") {
        //     System.out.println("Wue elegancia la de Francia");
        // } else if (Bebida == "Coca-Cola") {
        //     System.out.println("Este es de mi barrio");
        // }

    }
}