package model;

import java.util.ArrayList;

public class Entenador extends Empleado {
    private Contrato contratoE;
    private ArrayList<String> entrenadorAutorizados;

    public Entenador(Contrato contratoE, ArrayList<String> entrenadorAutorizados, String legajo, String nombre, String apellido, int edad, String email) {
        super(legajo, nombre, apellido, edad, email);
        this.contratoE = contratoE;
        this.entrenadorAutorizados = new ArrayList<String>();
    }
    
}
