
public class Contacto {

    //Nombre del contacto
    private String nombre;
    //Telefono del contacto  
    private String telefono; 

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre; 
        this.telefono = telefono; 
    }

    public String getNombre() {
        return nombre; 
    }

    public String getTelefono() {
        return telefono; 
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre; 
    }

    public void setTelefono(String nuevoTelefono) {
        telefono = nuevoTelefono; 
    }

    public String mostrarContacto() {
        return "Nombre: " + nombre + ". Telefono: " + telefono; 
    }
}