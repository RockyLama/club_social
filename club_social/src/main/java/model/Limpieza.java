package model;

import java.util.ArrayList;

public class Limpieza extends Empleado {
    private double dias;
    private double montoDia;
    private ArrayList<String> limpiezaAutorizados;

    public Limpieza(double dias, double montoDia, String legajo, String nombre, String apellido, int edad, String email) {
        super(legajo, nombre, apellido, edad, email);
        this.dias = dias;
        this.montoDia = montoDia;
        this.limpiezaAutorizados = new ArrayList<String>();
    } 

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    public double getMontoDia() {
        return montoDia;
    }

    public void setMontoDia(double montoDia) {
        this.montoDia = montoDia;
    }

    public double calculoSueldo(double montoDia, double dias) {
        double sueldo = montoDia * dias;
        return sueldo; 
    }

    
    
}
