import java.util.ArrayList; 

public class JugadorIndividual extends Jugador implements Puntuable {

    private ArrayList<Integer> puntaje;

    public JugadorIndividual(String nombre, int edad) {
        super(nombre, edad);
        this.puntaje = new ArrayList<>();
    }

    @Override
    public void agregarPuntaje(int puntos) {
        puntaje.add(puntos); 
    }

    @Override
    public int obtenerPuntajeTotal() {
        int total = 0; 
        for(Integer p : puntaje) {
            total = total + p; 
        }
        return total; 
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, yo soy " + nombre + " tengo " + edad + " años."); 
    }
}
