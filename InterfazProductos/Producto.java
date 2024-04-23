package InterfazProductos;

public class Producto {
    private String nombreProducto = "";
    private String precioProducto="";
    private String stock="";
    public Producto(String nombreProducto_param, String precioProducto_param, String stock_param) {
        this.nombreProducto = nombreProducto_param;
        this.precioProducto = precioProducto_param;
        this.stock = stock_param;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public String getPrecioProducto() {
        return precioProducto;
    }
    public String getStock() {
        return stock;
    }
    
    
}
