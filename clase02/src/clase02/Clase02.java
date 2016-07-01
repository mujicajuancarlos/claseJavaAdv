/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02;


public class Clase02 {
    
    
    public static void main(String[] args) {
        
        Oficina oficina = new Oficina();
        oficina.llego(new Empleado("Pepe", true));
        oficina.llego(new Empleado("Empleado1", false));
        oficina.llego(new Empleado("Empleado2", false));
        oficina.llego(new Empleado("Empleado3", false));
        oficina.llego(new Empleado("Empleado4", false));
        oficina.llego(new Empleado("Empleado5", false));
        oficina.llego(new Empleado("Empleado6", false));
        oficina.llego(new Empleado("Empleado7", false));
        
    }

    
}
