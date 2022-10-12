package model;

import java.util.Date;

public class ContratoProfesional {
    private double clausulaVenta;
    private Date vencimiento;
    private double Sueldo;

    public ContratoProfesional(double clausulaVenta, Date vencimiento, double Sueldo) {
        this.clausulaVenta = clausulaVenta;
        this.vencimiento = vencimiento;
        this.Sueldo = Sueldo;
    }

    public double getClausulaVenta() {
        return clausulaVenta;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public double getSueldo() {
        return Sueldo;
    }
    
}
