package Interfaces;
public class Estudiante{
    private String nombre = "";
    private String code ="";

    public Estudiante(String nombre_param, String code_param){
        this.nombre=nombre_param;
        this.code=code_param;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCode() {
        return this.code;
    }
    
}