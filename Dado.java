import java.util.Random; 

public class Dado {

    private int caras; 
    private Random random;

    public Dado(int caras) {
        this.caras = caras; 
        this.random = new Random();
    }

    public int lanzar() {
        int numero = random.nextInt(caras) + 1; 
        return numero; 
    }
}