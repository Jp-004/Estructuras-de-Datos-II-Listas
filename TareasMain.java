public class TareasMain {
    public static void main(String[] args) {
        Tareas tarea = new Tareas(); 

        tarea.agregarTarea("Estudiar"); 
        tarea.agregarTarea("Cocinar");
        tarea.agregarTarea("Programar");
        tarea.agregarTarea("Limpiar");
        
        tarea.mostrarTareas(); 

        tarea.eliminarTarea(1); 
        System.out.println("Tareas luego de eliminar: ");
        tarea.mostrarTareas(); 

        System.out.println("Se encuentra programar dentro de tareas?");
        tarea.verificar("Programar"); 

        System.out.println("Se encuentra cocinar dentro de tareas?");
        tarea.verificar("Cocinar"); 

        tarea.listaFinal(); 
    }
}