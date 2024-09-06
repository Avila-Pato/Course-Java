package javaCourse.poo2.abstractInterface;

import javaCourse.poo2.InterfaceDeep.Alimentable;
import javaCourse.poo2.InterfaceDeep.Comunicacion;

public class Caiman extends MoustroMarino implements Comunicacion, Alimentable {

    double Damage;

    public Caiman(String nombre,  double Damage) {
        super(nombre);
        this.Damage = Damage;
    }


    @Override
    public void atacar() {
        System.out.println(nombre + "El ataque es mordisco" + Damage + " Damage de ataque");
    }


    @Override
    public void enviarMensaje() {
        System.out.println(nombre + "emite sonidos de mordisco");
    }


    @Override
    public void alimentarse() {
        System.out.println(nombre + "come peces");
    }




    @Override
    public void Comunicacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Comunicacion'");
    }


}
