public class BucleFor {

    public static void main(String[] args) throws Exception {

        int  i;
        int  j;
        int  k;

        //for (Inicialiazando; Condicion; Actualizacion)

        for(i = 1; i <= 3; i++) {
            for( j = 1; j <= 3; j++){
                for( k = 1; k <= 3; k++){

                    System.out.print("i: ");
                    System.out.print(i);
                    System.out.print("j: ");
                    System.out.print(j);
                    System.out.print("k: ");
                    System.out.println(k);


                }
            }
        }
        
    }
    
}
