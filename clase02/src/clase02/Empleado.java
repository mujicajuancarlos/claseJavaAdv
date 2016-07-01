package clase02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class Empleado extends Thread{
    private Oficina oficina;
    private final String nombre;
    private final boolean esJefe;

    Empleado(String unNombre, boolean unBool) {
        this.nombre = unNombre;
        this.esJefe = unBool;
    }

    void setOficina(Oficina unaOficina) {
        this.oficina = unaOficina;
    }

    void saludar() {
        this.start();
    }
    
    public void run(){
         if (this.esJefe){
            this.oficina.saludarComoJefe(this);
        } else {
            this.oficina.saludarComoEmpleado(this);
        }
    }

    String getNombre() {
        return this.nombre;
    }

    boolean esJefe() {
        return this.esJefe;
    }
    
}
