import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        librosPrestados = new ArrayList<>();
    }

    public void agregarLibroPrestado(Libro libro) {
        if(!libro.estaPrestado()) {
            libro.prestar();
            librosPrestados.add(libro); 
        } else {
            System.out.println("El libro ya esta prestado"); 
        }
    }

    public void eliminarLibroDevuelto(Libro libro) {
        libro.devolver();
        librosPrestados.remove(libro); 
    }
    
    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados a: " + nombre); 
        for(Libro l : librosPrestados) {
            System.out.println(l); 
        }
    }
}