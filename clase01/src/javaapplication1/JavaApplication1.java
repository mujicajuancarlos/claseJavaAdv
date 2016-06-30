/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import model.Caballo;
import model.Hipodromo;

/**
 *
 * @author educacionit
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Hipodromo unHipodromo = new Hipodromo();
        unHipodromo.inscribirCaballos();
        unHipodromo.asignarMetaACaballos();
        unHipodromo.arrancarLaCarrera();
    }
    
}
