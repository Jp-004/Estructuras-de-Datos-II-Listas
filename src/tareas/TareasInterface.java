
public interface TareasInterface {

    //Agrega una tarea a la lista de tareas.
    void agregarTarea(String tares); 

    //Muestra las tareas que estan dentro de la lista de tareas.
    void mostrarTareas();

    //Elimina la tarea correspondiente al indice que se proporciona. 
    void eliminarTarea(int indice);

    //Verifica que una tarea esta dentro de la lista de tareas.
    boolean verificar(String tarea); 

    //Imprime la lista final con todas las tareas incluidas. 
    void mostrarListaFinal(); 
}