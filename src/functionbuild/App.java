package functionbuild;

public class App {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Hotel", "Mariscal", 54, "Turismo");

        System.out.println(empresa1.darNombreCompleto() + " tiene " + empresa1.edad + " años y su rubro es "
                + empresa1.rubro.nombre);
    }
}
