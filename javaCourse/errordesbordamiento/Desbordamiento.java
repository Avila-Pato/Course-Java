package javaCourse.errordesbordamiento;

public class Desbordamiento {
    
    public static void main(String[] args) {
        int vector [] = new int[10];

        for (int i = 0; i < 11; i++) {
            vector[i] = i;
        }
        // saldra un error de desbordamiento porque no hay espacio para el 11
        
    }
    
}
