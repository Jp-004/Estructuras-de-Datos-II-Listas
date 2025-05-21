import java.util.ArrayList; 
import java.util.Iterator; 

public class AgendaContactos {

    private ArrayList<Contacto> contactos;

    //Constructor
    public AgendaContactos() {
        contactos = new ArrayList<>();
    }

    /*
     * Metodo el cual agrega contactos a la agenda de contactos
     */
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto); 
    }

    public void eliminarContactosQueEmpiezanConA() {
        Iterator<Contacto> it = contactos.iterator(); 
        int i = 0; 
        while(it.hasNext()) {
            Contacto t = it.next();
            if(!t.getNombre().isEmpty() && t.getNombre().chatAt(0) == 'A') {
                it.remove();
            }
            i++;
        }
    }

    /*
     * Metodo el cual muestra la lista de contactos de la agenda 
     */
    public void mostrarContactos() {
        Iterator<Contacto> it = contactos.iterator(); 
        while(it.hasNext()) {
            Contacto t = it.next(); 
            System.out.println(t.mostrarContacto()); 
        }
    }
}