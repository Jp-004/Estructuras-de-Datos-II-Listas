// Clase base
public abstract class Jugador {
    protected String nombre;
    protected int edad;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void presentarse();
}
