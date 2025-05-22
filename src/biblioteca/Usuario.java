public class Usuario {
    private String nombre;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        librosPrestados = new ArrayList<>();
    }

    // COMPLETAR: agregarLibroPrestado(), mostrarLibrosPrestados(), etc.
}