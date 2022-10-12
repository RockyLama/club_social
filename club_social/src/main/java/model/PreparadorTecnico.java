package model;

import java.util.ArrayList;

public class PreparadorTecnico extends Empleado {
    private Contrato contratoPT;
    private ArrayList<String> preparadorTecnicoAutorizados;

    public PreparadorTecnico(Contrato contratoPT, String legajo, String nombre, String apellido, int edad, String email) {
        super(legajo, nombre, apellido, edad, email);
        this.contratoPT = contratoPT;
        this.preparadorTecnicoAutorizados = new ArrayList<String>();
    }

}
