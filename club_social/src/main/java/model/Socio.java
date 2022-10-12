package model;

import java.util.ArrayList;

public class Socio extends Persona {

    private String idSocio;
    private String tipoDeportista;
    private ArrayList<String> autorizados;
    private ArrayList<Factura> facturasPendientes;
    private ArrayList<Factura> facturasPagas;

    public Socio(String idSocio, String tipoDeportista, String nombre, String apellido, int edad, String email) {
        super(nombre, apellido, edad, email);
        this.idSocio = idSocio;
        this.tipoDeportista = tipoDeportista;
        this.autorizados = new ArrayList<String>();
        this.facturasPendientes = new ArrayList<Factura>();
        this.facturasPagas = new ArrayList<Factura>();
    }

    public String getIdSocio() {
        return idSocio;
    }

    public String getTipoDeportista() {
        return tipoDeportista;
    }

    public ArrayList<String> getAutorizados() {
        return autorizados;
    }

    public ArrayList<Factura> getFacturasPendientes() {
        return facturasPendientes;
    }

    public ArrayList<Factura> getFacturasPagas() {
        return facturasPagas;
    }

    public void agregarAutorizado(String nuevo) {
        this.autorizados.add(nuevo);
    }

    public void agregarFacturaPendiente(Factura nueva) {
        this.facturasPendientes.add(nueva);
    }

    public void cancelarFactura(int posicion) {
        this.facturasPagas.add(this.facturasPendientes.get(posicion));
        this.facturasPendientes.remove(posicion);
    }

}

















 /*
    public void pagoCuota(int idSocio, boolean alDia){
        alDia=true;
        double montoPago = cuotaSocial;
    }
    
    public void noPagaCuota(int idSocio, boolean alDia){
        int deudor = idSocio;
        alDia=false;
    }
    
    public void estadoSocio(int idSocio, boolean alDia, int mesesDeuda, boolean acceso){
        
        if(alDia=false && mesesDeuda==0){
            mesesDeuda++;
            deuda=cuotaSocial;
        }
        else if(alDia=false && mesesDeuda==1){
            mesesDeuda++;
            deuda=cuotaSocial*2;
        }
        else if(alDia=false && mesesDeuda==2){
            mesesDeuda++;  
            acceso=false;
            deuda=((cuotaSocial*2)*1.15)+cuotaSocial;     
        }
    }
    
    public void pagoDeuda(int idSocio, boolean alDia, int mesesDeuda, boolean acceso){
        double montoPago = deuda;
        mesesDeuda=0;
        deuda=0;
        acceso= true;
        
    }*/
