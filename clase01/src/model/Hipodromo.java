/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author educacionit
 */
public class Hipodromo {
    List<Caballo> caballos;

    public Hipodromo() {
        this.caballos = new ArrayList<>();
    }

    public void agregarCaballo(Caballo unCaballo) {
        this.caballos.add(unCaballo);
    }

    public void inscribirCaballos() {
        this.agregarCaballo(new Caballo("Caballo 1",2));
        this.agregarCaballo(new Caballo("Caballo 2",1));
        this.agregarCaballo(new Caballo("Caballo 3",3));
        this.agregarCaballo(new Caballo("Caballo 4",10));
        this.agregarCaballo(new Caballo("Caballo 5",2));
    }

    public void asignarMetaACaballos() {
        Meta unaMeta = new Meta(500);
        this.getCaballos().stream().forEach((unCaballo) -> {
            unCaballo.setMeta(unaMeta);
        });
    }

    public void arrancarLaCarrera() {
        this.getCaballos().stream().forEach((unCaballo) -> {
            unCaballo.correr();
        });
    }

    private List<Caballo> getCaballos() {
       return this.caballos;
    }
    
}
