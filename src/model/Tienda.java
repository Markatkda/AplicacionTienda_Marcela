package model;

import model.enums.TipoPersona;
import model.subclasses.Juridica;
import model.subclasses.Natural;

import java.util.ArrayList;
import java.util.Date;

public class Tienda {

    //atributos
    private String nombre;
    private String nit;
    private ArrayList<Factura> listaFacturas;
    private ArrayList<Cliente> listaClientes;

    public Tienda(String nombre, String nit, ArrayList<Factura> listaFacturas, ArrayList<Cliente> listaClientes) {
        this.nombre = nombre;
        this.nit = nit;
        this.listaFacturas = listaFacturas;
        this.listaClientes = listaClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(ArrayList<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }


    //CRUDS----------------------------------------------------


    //CRUD Cliente

    public boolean crearCliente (TipoPersona tipoPersona, String nombre, String direccion, String doc, String telefono, String email, String contrasenia, Date fechaNacimiento){

        if (tipoPersona==null) throw new NullPointerException("El tipo de persona es Nulo");

        if (tipoPersona == TipoPersona.NATURAL){



            Natural clienteNatural = new Natural(nombre, direccion, doc, telefono, email, contrasenia, fechaNacimiento);
            this.listaClientes.add(clienteNatural);


        } else {

            Juridica clienteJuridico ()
        }

        return true;
    }

}
