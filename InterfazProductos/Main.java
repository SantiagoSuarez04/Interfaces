package InterfazProductos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ImplemenInventario instancia = new ImplemenInventario(null);
        ArrayList<Producto> listaProductos= instancia.ObtenerProducto();
        for(Producto producto: listaProductos ){
            System.out.println("nombre: "+producto.getNombreProducto() + " Precio: "+producto.getPrecioProducto() + " Stock "+producto.getStock());
        }
    }
    
}
