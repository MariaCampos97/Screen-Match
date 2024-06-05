package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;

    private int fechaDeLanzamiento;

    private int duracionEnMinutos;

    private boolean incluidoEnELPlan;

    private double sumaDeLasEvaluaciones;

    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
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
}
