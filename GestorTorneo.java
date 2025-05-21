import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;   

public class GestorTorneo<T extends Puntuable> {

    private ArrayList<T> torneo;
    private Random random;  
    private Map<Jugador, Integer> ranking; 

    public GestorTorneo() {
        torneo = new ArrayList<>();
        random = new Random();
        ranking = new HashMap<>();
    }

    public void agregarJugador(T jugador) {
        torneo.add(jugador); 
    }

    public void registrarPuntajesAleatorios(int cantidadDeRondas) {
        random = new Random();
        for(int i = 0; i < cantidadDeRondas; i++) {
            for(T jugador : torneo) {
                int puntos = random.nextInt(11);
                jugador.agregarPuntaje(puntos); 
            } 
        }
    }

    public void mostrarRanking() {
       ranking = new HashMap<>();
       for(T jugador : torneo) {
            ranking.put(jugador, jugador.obtenerPuntajeTotal()); 
       }
    }
}
