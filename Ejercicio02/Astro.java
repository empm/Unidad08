package Ejercicio02;

import java.util.ArrayList;

abstract class Astro {

    protected String nombre;
    protected double masa;
    protected double tempMedia;

    public Astro(String nombre, double masa, double tempMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.tempMedia = tempMedia;
    }

    public void muestra(){
        System.out.println(this.nombre);
        System.out.println(this.masa);
        System.out.println(this.tempMedia);
    }
}

/**
 * Planeta
 */
class Planeta extends Astro {

    private double distSol;
    private double orbSol;
    private int numSat;

    public Planeta(String nombre, double masa, double tempMedia, double distSol, double orbSol, int numSat){
        super(nombre, masa, tempMedia);
        this.distSol = distSol;
        this.orbSol = orbSol;
        this.numSat = numSat;
    }

    @Override
    public void muestra(){
        super.muestra();
        System.out.println(this.distSol);
        System.out.println(this.orbSol);
        System.out.println(this.numSat);
    }
}

/**
 * Satelite
 */
class Satelite extends Astro {

    private double distPlaneta;
    private double orbPlaneta;
    private String nomPlaneta;

    public Satelite(String nombre, double masa, double tempMedia, double distPlaneta, double orbPlaneta, String nomPlaneta){
        super(nombre, masa, tempMedia);
        this.distPlaneta = distPlaneta;
        this.orbPlaneta = orbPlaneta;
        this.nomPlaneta = nomPlaneta;
    }

    @Override
    public void muestra(){
        super.muestra();
        System.out.println(this.distPlaneta);
        System.out.println(this.orbPlaneta);
        System.out.println(this.nomPlaneta);
    }
}