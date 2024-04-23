package Interfaces;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ImplementacionContenedor instancia = new ImplementacionContenedor(null);
    ArrayList<Estudiante> listaEstudiantes= instancia.obtenerEstudiante();
    for(Estudiante estudiante: listaEstudiantes ){
        System.out.println("nombre: "+estudiante.getNombre() + " code: "+estudiante.getCode());
    }
    }
}