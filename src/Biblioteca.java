import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) { 
        usuarios.add(usuario); 
    }

    public boolean prestarLibro(String titulo, Usuario usuario) {
        for (Libro l : libros) {
            if(l.getTitulo().equals(titulo)) {
                if(!l.estaPrestado()) {
                    usuario.agregarLibroPrestado(l);
                    return true;
                } else {
                    System.out.println("El libro esta prestado.");
                    return false;
                }
                
            }
        }
        System.out.println("Libro no encontrado");
        return false; 
    }

    public void mostrarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u.getNombre());
        }
    }
}