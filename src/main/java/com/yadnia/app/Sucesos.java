package com.yadnia.app;
import java.util.List;

public class Sucesos {
String fecha;
int duracion;
    public List<Temblores> tembloresOcurridos;

public Sucesos(String fecha, int duracion ){
    this.fecha = fecha;
    this.duracion = duracion;

}
    public String mostrarFecha(){
    return fecha;
    }
    public int mostrarDuracion(){
    return duracion;
    }



}

