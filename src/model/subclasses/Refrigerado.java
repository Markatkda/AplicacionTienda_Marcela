package model.subclasses;

import model.Producto;

public class Refrigerado extends Producto {

    //atributos
    private String codigoAprobacion;
    private double tempRefigeracion;

    public Refrigerado(String nombre, String codigo, int existencias, double valorUnitario) {
        super(nombre, codigo, existencias, valorUnitario);
    }

    public Refrigerado(String nombre, String codigo, int existencias, double valorUnitario, String codigoAprobacion, double tempRefigeracion) {
        super(nombre, codigo, existencias, valorUnitario);
        this.codigoAprobacion = codigoAprobacion;
        this.tempRefigeracion = tempRefigeracion;
    }

    public Refrigerado(String codigoAprobacion, double tempRefigeracion) {
        this.codigoAprobacion = codigoAprobacion;
        this.tempRefigeracion = tempRefigeracion;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public double getTempRefigeracion() {
        return tempRefigeracion;
    }

    public void setTempRefigeracion(double tempRefigeracion) {
        this.tempRefigeracion = tempRefigeracion;
    }
}
