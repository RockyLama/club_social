package model;


class Factura {
    private String consumidor;
    private String concepto;
    private double valor;

    public Factura(String consumidor, String concepto, double valor)
    {
        this.consumidor = consumidor;
        this.concepto = concepto;
        this.valor = valor;
    }

    public String getConsumidor()
    {
        return consumidor;
    }

    public String getConcepto()
    {
        return concepto;
    }

    public double getValor()
    {
        return valor;
    }
}
