package model;

public class Administrativo extends Empleado {

    private double cantidadHoras;
    private double nivelCargo;
    private double montoHora;

    public Administrativo(double cantidadHoras, double nivelCargo, double montoHora, String legajo, String nombre, String apellido, int edad, String email) {
        super(legajo, nombre, apellido, edad, email);
        this.cantidadHoras = cantidadHoras;
        this.nivelCargo = nivelCargo;
        this.montoHora = montoHora;
    }

    public double calculoSueldo(double montoHora, double cantidadHoras, double nivelCargo) {
        double sueldo = (montoHora * cantidadHoras) + nivelCargo;
        return sueldo;
    }

}
