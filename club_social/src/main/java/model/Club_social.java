package model;

import java.util.HashMap;

public class Club_social {

    private HashMap<String, Socio> socios;
    private HashMap<String, Empleado> empleado;

    public Club_social() {
        this.socios = new HashMap<String, Socio>();
        this.empleado = new HashMap<String, Empleado>();
    }

    public Socio obtenerSocio(String idSocio) {
        return socios.get(idSocio);
    }

    public void agregarSocio(Socio nuevo) {
        socios.put(nuevo.getIdSocio(), nuevo);
    }

    public void agregarAutorizado(String idSocio, String autorizado) {
        socios.get(idSocio).agregarAutorizado(autorizado);
    }

    public void agregarFactura(String idSocio, String nombre, String concepto, double valor) {
        socios.get(idSocio).agregarFacturaPendiente(new Factura(nombre, concepto, valor));
    }

    public void cancelarFactura(String idSocio, int posicion) {
        socios.get(idSocio).cancelarFactura(posicion);
    }

    public Empleado obtenerEmpleado(String legajo) {
        return empleado.get(legajo);
    }

    public void agregarEmpleado(Empleado nuevo) {
        empleado.put(nuevo.getLegajo(), nuevo);
    }

    public void agregarEmpleadoAutorizado(String legajo, String autorizado) {
        empleado.get(legajo).agregarEmpleadoAutorizado(autorizado);
    }

}




















/*
 public boolean validarAcceso(boolean acceso) {
        return acceso;
    }

    public double gastoSalarios(double valorSalarios){
        return valorSalarios;

    }
    public static void main(String[] args) {
        Gerente gerente1;
        gerente1= new Gerente(20, 40000, 1000, 1, true, "Mai", "Va", 20, "mai@gmail");
        
        System.out.println(gerente1.calculoSueldo(1000, 20, 40000));
    }*/
