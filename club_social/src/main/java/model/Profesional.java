package model;

import java.util.ArrayList;

public class Profesional extends Empleado {
    private ContratoProfesional contratoP;
    private String tipoDeportista;
    private ArrayList<String> profesionalAutorizados;

    public Profesional(ContratoProfesional contratoP, String tipoDeportista, String legajo, String nombre, String apellido, int edad, String email) {
        super(legajo, nombre, apellido, edad, email);
        this.contratoP = contratoP;
        this.tipoDeportista = tipoDeportista;
        this.profesionalAutorizados = new ArrayList<String>();
    }



}
