package poo;

public class Carrera {
    String nombre;
    double duracion;
    Boolean estaEnCurso;

    public Carrera( String nombre, int duracion, boolean estaCursando) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.estaEnCurso = estaCursando;
    }


  public Carrera(String nombre) {
    this.nombre = nombre;
  }

}
