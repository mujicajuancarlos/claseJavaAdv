/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author educacionit
 */
public class Caballo extends Thread {
    String nombre;
    Meta meta;
    double posicion;
    double velocidad;

    public Caballo(String unNombre, double unaVelocidad) {
        this.nombre = unNombre;
        this.velocidad = unaVelocidad;
    }

    void setMeta(Meta unaMeta) {
        this.meta = unaMeta;
    }

    public void correr() {
        this.start();
    }
    
    @Override
    public void run(){
        while(this.getMeta().cumplioObjetivo(this)){
            double nuevaPosicion = this.getPosicion() + this.getVelocidad();
            this.setPosicion(nuevaPosicion);
        }
        System.out.println(this.getNombre());
    }

    private Meta getMeta() {
        return this.meta;
    }

    double getPosicion() {
        return this.posicion;
    }

    private void setPosicion(double nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    private double getVelocidad() {
        return this.velocidad;
    }

    private String getNombre() {
        return this.nombre;
    }
}
