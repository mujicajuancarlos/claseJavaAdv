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
public class Meta {
    Integer metros;

    Meta(int distancia) {
        this.metros = distancia;
    }

    public boolean cumplioObjetivo(Caballo unCaballo) {
        return unCaballo.getPosicion() >= this.getMetros();
    }

    private double getMetros() {
        return this.metros;
    }
}
