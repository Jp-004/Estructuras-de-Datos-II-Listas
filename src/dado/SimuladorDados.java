import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;  

public class SimuladorDados {

    private Dado dado;
    private List<Integer> lanzamientos; 

    public SimuladorDados(Dado dado) {
        this.dado = dado;
        this.lanzamientos = new ArrayList<>(); 
    }

    public void simularLanzamientos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int resultado = dado.lanzar();
            lanzamientos.add(resultado);
        }
    }

    //Metodo sin terminar... 
    public void mostrarFrecuencias() {
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for(int numero : lanzamientos) {
            if(frecuencia.containsKey(numero)) {
                frecuencia.put(numero, frecuencia.get(numero) + 1);
            } else {
                frecuencia.put(numero, 1); 
            }
        } 
    }
}
