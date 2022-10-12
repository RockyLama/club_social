package model;

import java.util.ArrayList;

public class Empleado extends Persona {

    private String legajo;
    private ArrayList<String> empleadoAutorizados;

    public Empleado(String legajo, String nombre, String apellido, int edad, String email) {
        super(nombre, apellido, edad, email);
        this.legajo = legajo;
        this.empleadoAutorizados = new ArrayList<String>();
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    
     public void agregarEmpleadoAutorizado(String nuevo) {
        this.empleadoAutorizados.add(nuevo);
    }
 

}
