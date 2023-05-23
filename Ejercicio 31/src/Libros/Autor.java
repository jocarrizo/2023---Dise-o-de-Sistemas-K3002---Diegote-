package Libros;

import java.util.Date;

public class Autor {
    
    String nombre;
    Date fecha_nacimiento;
    String nacionalidad;
        
    public Autor(String nombre, Date fecha_nacimiento, String nacionalidad){
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
    }
    
    public String getNombre(){
        return nombre;
    }

    public Date getFecha_nacimiento(){
        return fecha_nacimiento;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }
    
}
