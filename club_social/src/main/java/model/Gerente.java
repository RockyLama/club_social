package model;
public class Gerente extends Administrativo {
   /* private double nivelCargo = 40.000;
    private double montoHora= 1000;
    private double cantidadHoras=8;*/

    public Gerente(double cantidadHoras, double nivelCargo, double montoHora, String legajo, String nombre, String apellido, int edad, String email) {
        super(cantidadHoras, nivelCargo, montoHora, legajo, nombre, apellido, edad, email);
    }
/*
    public double getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(double nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public double getMontoHora() {
        return montoHora;
    }

    public void setMontoHora(double montoHora) {
        this.montoHora = montoHora;
    }

    public double getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(double cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }*/
}
