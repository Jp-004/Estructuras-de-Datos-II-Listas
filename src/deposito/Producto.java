public class Producto {

    //Nombre del producto
    private String nombre;
    //Precio del producto
    private double precio;
    //Stock disponible del producto
    private int stock; 

    /*
     * Constructor de la clase Producto sin stock disponible
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        stock = 0; 
    }

    /*
     * Constructor de la clase Producto iniciando con un stock disponible
     */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio; 
        this.stock = stock; 
    }

    /*
     * Retorna el nombre del producto
     */
    public String getNombre() {
        return nombre; 
    }

    /*
     * Retorna el precio del producto
     */
    public double getPrecio() {
        return precio; 
    }

    /*
     * Retorna el stock disponible del producto
     */
    public int getStock() {
        return stock; 
    }

    /*
     * Modifica el precio del producto con un nuevo precio
     */
    public void setPrecio(double nuevoPrecio) {
        precio = nuevoPrecio; 
    }
}