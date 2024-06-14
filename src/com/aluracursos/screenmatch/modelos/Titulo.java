package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepción.ErrorEnConversionDeDuracionExcepcion;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {


    private String nombre;
//@SerializedName es para que reconozca el nombre de nuestros atributos por los que aparecen en e Json
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnELPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) throws ErrorEnConversionDeDuracionExcepcion {
        this.nombre = miTituloOmdb.Title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ", ""));
    if (miTituloOmdb.runtime().contains("N/A")) {
        throw new ErrorEnConversionDeDuracionExcepcion("No pude convertir la duración, " +
                "porque contiene un N/A");

    }
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnELPlan() {
        return incluidoEnELPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnELPlan(boolean incluidoEnELPlan) {
        this.incluidoEnELPlan = incluidoEnELPlan;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es:" + nombre);
        System.out.println("Su fecha de lanzamiento es:" + fechaDeLanzamiento);
        System.out.println("Duración en minutos es:" + getDuracionEnMinutos());

    };


    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota; //Se intepreta sumaDelasEvaluaciones = sumaDeLasEvaluaciones + nota
        totalDeLasEvaluaciones++; //Se esta incrementando
    }

    public double calculaMedia(){
        return  sumaDeLasEvaluaciones /  totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());

    }

    @Override
    public String toString() {
        return "(nombre='" + nombre +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento+
                ", duracion = " +duracionEnMinutos;)
    }
}
