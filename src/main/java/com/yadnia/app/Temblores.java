package com.yadnia.app;


public class Temblores extends Sucesos{
    Double escalaRichter;
    Double latitud;
    Double longitud;

    public Temblores(String fecha, int duracion, Double escalaRichter, Double latitud, Double longitud) {
        super(fecha, duracion);
        this.escalaRichter= escalaRichter;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    public Double getEscalaRichter(){
        return escalaRichter;
    }
    public Double getLatitud(){
        return latitud;
    }
    public Double getLongitud(){
        return longitud;
    }
}
