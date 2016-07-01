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
public class Cola {
    private String valor;

    public synchronized String agregar(String unValor) throws InterruptedException {
        if(this.valor != null){
            wait();
        }
        this.valor = unValor;
        notify();
        return unValor;
    }
    
    public synchronized String sacar() throws InterruptedException {
        if(this.valor == null){
            wait();
        }
        String unValor = this.valor;
        this.valor = null;
        notify();
        return unValor;
    }
}
