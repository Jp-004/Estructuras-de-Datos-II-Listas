import java.util.ArrayList;

public class Deposito<T> implements Almacenable<T> {
    
    private ArrayList<T> elementos;
    
    public Deposito() {
        elementos = new ArrayList<>();
    }

    @Override
    public void guardar(T elemento) {
        elementos.add(elemento); 
    }

    @Override
    public boolean remover(int index) {
        if(index >= 0 && index < elementos.size()) {
            elementos.remove(index);
            return true; 
        }
        return false; 
    }

    @Override
    public void mostrarElementos() {
        for(T elem : elementos) {
            System.out.println(elem); 
        }
    }
}