import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos; 

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto); 
    }

    public ArrayList<Producto> productosConStockMayorA(int cantidad) {
        ArrayList<Producto> mayores = new ArrayList<>();
        Iterator<Producto> it = productos.iterator(); 
        Producto p = it.next(); 
        while(it.hasNext()) {
            if(p.getStock() > cantidad) {
                mayores.add(p);
            }
        }
        return mayores; 
    }

    public double calcularValorTotalDeProductosConStockMayorA(int cantidad) {
        ArrayList<Producto> mayores = productosConStockMayorA(cantidad);
        double total = 0.0;
        for (Producto p : mayores) {
            total = total + p.getPrecio();
        }
        return total; 
    }
}