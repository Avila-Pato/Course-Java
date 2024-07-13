public class Operadores {

    public static void main(String[] args) {

        // Operadores : simbolos que sirven para hacer operaciones con variables o
        // valores
        // Aritemticos:

        double p = 6;
        double l = p % 2; // c será 0, porque 6 dividido por 2 es 3 con un resto de 0

        double s = 7;
        double e = s % 2;
        System.err.println(e); // Imprimirá 1, porque 7 dividido por 2 es 3 con un resto de 1

        // Asignaciones
        
        int f = 5;  // Asigna 5 a 'f'
        System.out.println("f = " + f); // Imprime 5

        f = 10;    // Asigna 10 a 'f', sobrescribiendo el valor anterior
        System.out.println("f = " + f); // Imprime 10

        f = 15;    // Asigna 15 a 'f', sobrescribiendo el valor anterior
        System.out.println("f = " + f); // Imprime 15
        
        // Asignación compuesta
        f += 2;    // Equivale a f = f + 2; Asigna 17 a 'f' (15 + 2)
        System.out.println("f += 2: " + f); // Imprime 17

        // Resta y asigna
        f -= 3;    // Equivale a f = f - 3; Asigna 14 a 'f' (17 - 3)
        System.out.println("f -= 3: " + f); // Imprime 14

        // Multiplica y asigna
        f *= 2;    // Equivale a f = f * 2; Asigna 28 a 'f' (14 * 2)
        System.out.println("f *= 2: " + f); // Imprime 28

        // Divide y asigna
        f /= 4;    // Equivale a f = f / 4; Asigna 7 a 'f' (28 / 4)
        System.out.println("f /= 4: " + f); // Imprime 7

        // Módulo y asigna
        f %= 5;    // Equivale a f = f % 5; Asigna 2 a 'f' (7 % 5)
        System.out.println("f %= 5: " + f); // Imprime 2



        //Operadores de logica

        boolean condicion1 = true ;
        boolean condicion2 = false ;

        boolean resultadoAND = condicion1 && condicion2; //Ambos deben ser positivos para que sea true
        boolean resultadoOR = condicion1 || condicion2; //uno de los 2 debe ser positivo para que sea true
        boolean resultadoNOT = !condicion1; //lo opuesto que tenga asignado previamente 


            System.err.println("---------------");
        System.err.println(resultadoAND);
        System.err.println(resultadoOR);
        System.err.println(resultadoNOT);
            System.err.println("---------------");





        //Ejemplos

         
        boolean a = true;
        boolean b = false;

        // AND lógico (&&)
        System.out.println("Operador AND (&&):");
        boolean c = a && b;  // c será false porque a es true y b es false
        System.out.println("a && b: " + c);  // Imprime false

        // Evaluación lógica con valores numéricos usando AND
        int x = 5;
        int y = 10;
        boolean d = (x > 0) && (y < 15);  // d será true porque ambas condiciones son true
        System.out.println("(x > 0) && (y < 15): " + d);  // Imprime true

        System.out.println("-----------------------");

        // OR lógico (||)
        System.out.println("Operador OR (||):");
        c = a || b;  // c será true porque a es true
        System.out.println("a || b: " + c);  // Imprime true

        // Evaluación lógica con valores numéricos usando OR
        d = (x < 0) || (y > 5);  // d será true porque una de las condiciones es true
        System.out.println("(x < 0) || (y > 5): " + d);  // Imprime true

        System.out.println("-----------------------");

        // NOT lógico (!)
        System.out.println("Operador NOT (!):");
        c = !a;  // c será false porque a es true
        System.out.println("!a: " + c);  // Imprime false

        c = !b;  // c será true porque b es false
        System.out.println("!b: " + c);  // Imprime true

        System.out.println("-----------------------");

        c = (a && b) || (!a && !b);  // c será false porque (true && false) || (false && true) es false

        // Combinación de operadores lógicos
        System.out.println("Combinación de operadores lógicos:");
      
        System.out.println("(a && b) || (!a && !b): " + c);  // Imprime false
        System.err.println(l);
        System.err.println(f);
    }
}
