/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02_b;

/**
 *
 * @author educacionit
 */
public class Clase02_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cola unaCola = new Cola();
       Productor unProductor = new Productor(unaCola);
       Consumidor consumidor1 = new Consumidor(unaCola);
       
       unProductor.start();
       consumidor1.start();
    }
    
}
