
public interface NotasInterface {

    //Ingresa una nota a la lista de notas.
    void ingresarNota(double nota); 

    //Imprime las notas dentro de la lista de notas.
    void mostrarNotas();

    //Calcula el promedio de las notas. 
    double promedio(); 

    //Filtra las notas mayores a 7.0.
    void notasMayores(); 

    //Elimina la nota de menor valor dentro de la lista. 
    double elimNotaMasBaja(); 

    //Verifica si la lista de notas esta completa. 
    boolean estaCompleto(); 
}