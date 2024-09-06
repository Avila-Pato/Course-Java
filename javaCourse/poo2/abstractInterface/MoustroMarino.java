package javaCourse.poo2.abstractInterface;

public abstract class MoustroMarino {

    // variable
    String nombre;

    public MoustroMarino(String nombre) {
        this.nombre = nombre;
    }

    // esto oblica a sobreescribir el las clases que heredan la clase MoustroMarino
    public abstract void atacar();

    public abstract void alimentarse();

    public abstract void Comunicacion();

    public abstract void enviarMensaje();
}

