/*
 * Crea una lista de notas de estudiantes.
 */
public class Notas {
    private double[] noteList; 
    private static int MAX_SIZE = 30; //Cantidad maxima de notas
    private int index; 
    
    public Notas() {
        noteList = new double[MAX_SIZE]; 
        index = 0;
    }

    public void ingresarNota(double nota) {
        if(estaCompleto()) {
            System.out.println("Error, la lista esta completa.");
        }
        noteList[index] = nota;
        index++; 
    }

    public void mostrarNotas() {
        System.out.println("Todas las notas: "); 
        for(int i = 0; i < index; i++) {
            System.out.println(noteList[i]);
        }
    }

    public double promedio() {
        double suma = 0.0; 
        int contador = 0; 
        for(int i = 0; i < index; i++) {
            suma = suma + noteList[i]; 
            contador++; 
        }

        return suma / contador; 
    }

    public void notasMayores() {
        System.out.println("Notas mayores a 7: ");
        for(int i = 0; i < index; i++) {
            if (noteList[i] >= 7) {
                System.out.println(noteList[i]);
            }
        }
    }

    public double elimNotaMasBaja() {
        if (index == 0) return -1;

        double notaMin = noteList[0];
        int posMin = 0;

        for (int i = 1; i < index; i++) {
            if (noteList[i] < notaMin) {
                notaMin = noteList[i];
                posMin = i;
            }
        }

        for (int i = posMin; i < index - 1; i++) {
            noteList[i] = noteList[i + 1];
        }
        index--;
        return notaMin;
    }

    public boolean estaCompleto() {
        return index == MAX_SIZE; 
    }
}