import java.util.HashSet;
import java.util.Set; 

public class MainMuseo {
    public static void main(String[] args) { 
        Set<String> nombres = new HashSet<>(); 

        nombres.add("Barella");
        nombres.add("Lautaro");
        nombres.add("Acerbi");
        nombres.add("Thuram");
        nombres.add("Barella"); 

        System.out.println("Cantidad de visitantes unicos: "); 
        int cantidad = nombres.size(); 
        System.out.println(cantidad); 

        System.out.println("Esta persona visito el museo?: Lautaro"); 
        boolean bool = nombres.contains("Lautaro"); 
        System.out.println(bool);

        System.out.println("Esta persona visito el museo?: Raphinha"); 
        boolean bool2 = nombres.contains("Raphinha"); 
        System.out.println(bool2);
    }
}