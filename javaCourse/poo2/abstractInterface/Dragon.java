package javaCourse.poo2.abstractInterface;

import javaCourse.poo2.InterfaceDeep.Alimentable;
import javaCourse.poo2.InterfaceDeep.Comunicacion;

public class Dragon extends MoustroMarino implements Comunicacion, Alimentable {

    public Dragon(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " Su ataque es fuego");
    }

    @Override
    public void enviarMensaje() {

        System.out.println(nombre + " Emite sonidos de fuego ");
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + "caimanes");
    }

    @Override
    public void Comunicacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Comunicacion'");
    }



 
}
