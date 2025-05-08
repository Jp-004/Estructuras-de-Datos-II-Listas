import java.util.ArrayList;
import java.util.List; 

public class Tareas {
    
    private List<String> lista; 

    public Tareas() {
        lista = new ArrayList<>(); 
    }

    public void agregarTarea(String tarea) {
        lista.add(tarea); 
    }

    public void mostrarTareas() {
        int indice = 0; 
        for(String tarea : lista) {
            System.out.println("Tarea: " + tarea + ". Indice: " + indice);
            indice++;  
        }
    }

    public void eliminarTarea(int indice) {
        lista.remove(indice); 
    }

    public boolean verificar(String tarea) {
        for(String a : lista) {
            if (a.equals(tarea)) {
                System.out.println("Verdadero");
                return true;
            }
        }
        System.out.println("Falso");
        return false; 
    }

    public void listaFinal() {
        for(String tarea : lista) {
            System.out.println("Tarea: " + tarea);  
        }
    }
}