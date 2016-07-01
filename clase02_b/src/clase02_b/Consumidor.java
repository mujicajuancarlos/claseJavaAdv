/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02_b;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author educacionit
 */
public class Consumidor extends Thread {
    private Cola cola;

    Consumidor(Cola unaCola) {
        this.cola = unaCola;
    }
    @Override
    public void run(){
        while (true){
            try {
                System.out.println("Se consumio " + cola.sacar());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}
