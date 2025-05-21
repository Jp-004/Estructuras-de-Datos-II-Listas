public interface Almacenable<T> {

    void guardar(T elemento); 

    boolean remover(int index); 

    void mostrarElementos(); 
}