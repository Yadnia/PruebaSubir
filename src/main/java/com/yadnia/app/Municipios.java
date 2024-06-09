package com.yadnia.app;

import java.util.ArrayList;
import java.util.List;


public class Municipios {
        private String nombre;
        private int extension;
    public List<Sucesos> sucesosOcurridos;
    List<Sucesos> listaTemblores = new ArrayList<>();
    List<Sucesos> listaLluvias = new ArrayList<>();
    public Municipios(String nombre, int extension) {
        this.nombre = nombre;
        this.extension = extension;
        sucesosOcurridos = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getExtension(){
        return extension;
    }
    public void setExtension(int extension){
        this.extension = extension;
    }
    public void agregarSucesos( Sucesos unSuceso){
        sucesosOcurridos.add(unSuceso);
        if (unSuceso instanceof Lluvias) {
            listaLluvias.add(unSuceso);}
        if (unSuceso instanceof Temblores) {
            listaTemblores.add(unSuceso);}
    }
    public void eliminarSucesos(Sucesos unSuceso){
        sucesosOcurridos.remove(unSuceso);
    }
    public List<Sucesos> mostrarLluvias() {
        int i = 1;
        for (Sucesos suceso : sucesosOcurridos) {
            if (suceso instanceof Lluvias) {
                Lluvias lluvia = (Lluvias) suceso;
                System.out.println("LLUVIA  " + i + "-----------------------------------------------------------------------------------:");
                System.out.println("Fecha: " + lluvia.mostrarFecha());
                System.out.println("Duración: " + lluvia.mostrarDuracion());
                System.out.println("Milimetros por hora: " + lluvia.getMilimetrosPorHora());
                System.out.println("Tipo: " + lluvia.getTipo());
                i++;

        }

    } return listaLluvias; }
        public List<Sucesos> mostrarTemblores () {
            int j = 1;
            for (Sucesos suceso : sucesosOcurridos) {
                if (suceso instanceof Temblores) {
                    Temblores temblor = (Temblores) suceso;
                    System.out.println("TEMBLOR " + j + " -----------------------------------------------------------------------------------:");
                    System.out.println("Fecha: " + temblor.mostrarFecha());
                    System.out.println("Duración: " + temblor.mostrarDuracion());
                    System.out.println("Escala de Richter: " + temblor.getEscalaRichter());
                    System.out.println("Latitud: " + temblor.getLatitud());
                    System.out.println("Longitud: " + temblor.getLongitud());
                    j++;

            }}

            return listaTemblores;

        }
        public void eliminarLluvias(Sucesos unSuceso){
        listaLluvias.remove(unSuceso);
        sucesosOcurridos.remove(unSuceso);

        }

    public void eliminarTemblores(Sucesos unSuceso){
        listaTemblores.remove(unSuceso);
        sucesosOcurridos.remove(unSuceso);

    }
public void lluviaMayor(){
        double mayorDura = Double.MIN_VALUE;
        Sucesos lluviaMayor=null;
        for(Sucesos lluvia : listaLluvias){
            if(lluvia.mostrarDuracion()>mayorDura){
                mayorDura = lluvia.mostrarDuracion();
                lluviaMayor = lluvia;
            }
        }
        if(lluviaMayor!= null){
        System.out.println("Valor de la lluvia con mayor duracion:" +lluviaMayor.mostrarDuracion());
    System.out.println("Fecha: " + lluviaMayor.mostrarFecha());
    System.out.println("Duración: " + lluviaMayor.mostrarDuracion());
    if( lluviaMayor instanceof  Lluvias){
        Lluvias lluviaMaDa =(Lluvias) lluviaMayor;
        System.out.println("Milimetros por hora: " + lluviaMaDa.getMilimetrosPorHora());
    System.out.println("Tipo: " + lluviaMaDa.getTipo());}
}else {
            System.out.println("No hay lluvias para mostrar");
        }
    }
    public void temblorMayor() {
        double mayorEsc = Double.MIN_VALUE;
        Sucesos temblorMayor = null;

        for (Sucesos temblor : listaTemblores) {
            if (temblor instanceof Temblores) {
                Temblores tembloor = (Temblores) temblor;
                if (tembloor.getEscalaRichter() > mayorEsc) {
                    mayorEsc = tembloor.getEscalaRichter();
                    temblorMayor = tembloor;
                }
            }
        }

        if (temblorMayor != null) {
            System.out.println("Valor del temblor con mayor escala: " + mayorEsc);
            System.out.println("Fecha: " + temblorMayor.mostrarFecha());
            System.out.println("Duración: " + temblorMayor.mostrarDuracion());
            if (temblorMayor instanceof Temblores) {
                Temblores temblorMayorDetalles = (Temblores) temblorMayor;
                System.out.println("Latitud: " + temblorMayorDetalles.getLatitud());
                System.out.println("Longitud: " + temblorMayorDetalles.getLongitud());
            }
        } else {
            System.out.println("No hay temblores para mostrar");
        }
    }
}
