public class ElseEjemplo {

    public static void main(String[] args) {
        
        int edad = 80;


        if (edad > 18 && edad <= 60) {
            System.out.println("Es mayor de Edad");

        }else if ( edad > 60 ) {
                System.out.println("No puedes entrar Porque tas Viejito");
                
            } else if ( edad == 18) {
            System.out.println("ya es Grandote, puede ir al hospital solo");
         
            
        }else {
            System.out.println("Es Menor de edad");
        }

    }
}