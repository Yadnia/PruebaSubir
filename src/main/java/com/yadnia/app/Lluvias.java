package com.yadnia.app;



public class Lluvias extends Sucesos{
    Double milimetrosPorHora;
    String tipo;



    public Lluvias(String fecha, int duracion, Double milimetrosPorHora, String tipo) {
        super(fecha, duracion);
        this.milimetrosPorHora = milimetrosPorHora;
        this.tipo = tipo;
    }
    public String getfecha(){
        return fecha;
    }
    public Double getMilimetrosPorHora(){
        return milimetrosPorHora;
    }
    public String getTipo(){
        return tipo;
    }
}
