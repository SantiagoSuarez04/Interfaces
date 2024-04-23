package Interfaces;
import java.util.ArrayList;

public class ImplementacionContenedor implements Contenedor{

    public ArrayList<Estudiante> listaEstudiante = new ArrayList();

    public ImplementacionContenedor(ArrayList<Estudiante> listEstudiantes){
        listaEstudiante.add(new Estudiante("miguel", "1234"));
        listaEstudiante.add(new Estudiante("pedro", "1235"));
        listaEstudiante.add(new Estudiante("pablo", "1236"));
    }
     ArrayList<Estudiante> obtenerEstudiante(){
        return this.listaEstudiante;

    }
}
