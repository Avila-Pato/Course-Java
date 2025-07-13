package javaCourse.Enunciados;
// Llevar a cabo un programa que incluya  un vector para  que almacene los  nombres:
// alejandra, leonardo, rosa, guillermo, gabriel, daniel, luisa y ludmila. 
//realizar un recorrido del vector para cargar los  datos  y otro recorrido para mostrar los mismos datos
public class Enunciado1 {
    public static void main(String[] args) {
     String nombre [] = new String[8];

     nombre[0] = "alejandra";
     nombre[1] = "leonardo";
     nombre[2] = "rosa";
     nombre[3] = "guillermo";
     nombre[4] = "gabriel";
     nombre[5] = "daniel";
     nombre[6] = "luisa";
     nombre[7] = "ludmila";


     for(int i = 0; i < nombre.length; i++){
        System.out.println("Indice " + i + " Nombre " + nombre[i]);
     }

    }
}
