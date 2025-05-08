
public class NotasMain {
    public static void main(String[] args) {

        Notas noteList = new Notas();

        noteList.ingresarNota(2.3);
        noteList.ingresarNota(3.8);
        noteList.ingresarNota(5.7);
        noteList.ingresarNota(7.9);
        noteList.ingresarNota(9.8); 
        noteList.ingresarNota(10.0); 

        noteList.mostrarNotas(); 

        noteList.elimNotaMasBaja(); 

        noteList.mostrarNotas(); 

        noteList.notasMayores(); 
        noteList.ingresarNota(4.5);

        double promedio = noteList.promedio();
        System.out.println("Promedio: " + promedio); 

        noteList.mostrarNotas();
    }
}