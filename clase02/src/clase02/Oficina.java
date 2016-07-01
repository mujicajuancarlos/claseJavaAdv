package clase02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class Oficina {
    List<Empleado> empleados = new ArrayList<Empleado>();

    void llego(Empleado empleado) {
        empleado.setOficina(this);
        this.addEmpleado(empleado);
        empleado.saludar();
    }

    private void addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    void saludarComoJefe(Empleado unJefe) {
        //debo saludar y notificar
        System.out.println("Hola soy " + unJefe.getNombre());
        
    }

    void saludarComoEmpleado(Empleado unEmpleado) throws InterruptedException {
        //debo saludar solo si llego el jefe
        synchronized(empleados){
            if ( this.llegoElJefe() ){
                System.out.println("Hola soy " + unEmpleado.getNombre());
            } else {
                this.wait();
            }
        }
    }

    private boolean llegoElJefe() {
        return empleados.stream().anyMatch( e -> e.esJefe());
    }
    
}
