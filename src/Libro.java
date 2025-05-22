public class Libro {
    private String titulo;
    private boolean prestado;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo; 
    }

    public void setTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo; 
    }

    public boolean estaPrestado() {
        return prestado; 
    }
    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " | Prestado: " + prestado;
    }
}