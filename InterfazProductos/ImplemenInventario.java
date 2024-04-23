package InterfazProductos;

import java.util.ArrayList;

public class ImplemenInventario implements Inventario{
    public ArrayList<Producto> listaProductos=new ArrayList<>();

    public ImplemenInventario(ArrayList<Producto> listProductos){
    listaProductos.add(new Producto("lechuga", "1800", "10"));
    listaProductos.add(new Producto("agua", "1000", "20"));
    listaProductos.add(new Producto("papel", "1200", "50"));
}
    ArrayList<Producto> ObtenerProducto(){
        return this.listaProductos;
    }
}