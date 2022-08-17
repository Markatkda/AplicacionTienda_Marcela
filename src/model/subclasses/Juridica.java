package model.subclasses;

import model.Cliente;
import model.enums.TipoPersona;

public class Juridica extends Cliente {

    //Atributos
    private String nit;
    private String id_tributaria;

    public Juridica(String nit, String id_tributaria) {
        super();
        this.nit = nit;
        this.id_tributaria = id_tributaria;
    }

    public Juridica(String nombre, String direccion, String documento, String telefono, String email, String contrasenia, String nit, String id_tributaria) {
        super(nombre, direccion, documento, TipoPersona.JURIDICA, telefono, email, contrasenia);
        this.nit = nit;
        this.id_tributaria = id_tributaria;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getId_tributaria() {
        return id_tributaria;
    }

    public void setId_tributaria(String id_tributaria) {
        this.id_tributaria = id_tributaria;
    }
}
