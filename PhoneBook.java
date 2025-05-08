import java.util.Map;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {

        Map<String, String> agenda = new HashMap<>(); 

        agenda.put("Juan", "3584673879"); 
        agenda.put("Alberto", "3585917367"); 
        agenda.put("Hugo", "3585098907"); 
        agenda.put("Juani", "3584260611"); 
        agenda.put("Maria", "3584756785");
        System.out.println(" "); 

        System.out.println("Contactos de la agenda: "); 
        System.out.println(agenda.keySet());
        System.out.println(" ");

        System.out.println("Cual es el numero de telefono de: Juani?"); 
        String numero = agenda.get("Juani"); 
        System.out.println(numero); 
        System.out.println(" "); 

        agenda.remove("Hugo"); 

        System.out.println("Agenda luego de eliminar un elemento: "); 
        System.out.println(agenda.keySet());
        System.out.println(" ");
    }
}