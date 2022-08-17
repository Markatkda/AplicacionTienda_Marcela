package model;

import exceptions.StringNuloOrVacioException;
import model.enums.TipoProducto;
import utilities.MyUtils;

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
    /*
    Create
    Read
    Update
    Delete
     */


    //CRUD Cliente

    private void crearCliente(TipoPersona tipoPersona, String nombre, String direccion, String doc, String telefono, String email, String contrasenia, Date fechaNacimiento, String nit, String id_tributaria) throws StringNuloOrVacioException {

        if (tipoPersona == null) throw new NullPointerException("El tipo de persona es Nulo");

        MyUtils.validarSiNuloOrVacio(nombre, direccion, doc, telefono, email, contrasenia);

        if (tipoPersona == TipoPersona.NATURAL) {

            if (fechaNacimiento == null) throw new NullPointerException("La fecha de nacimiento indicada es nula");

            Natural clienteNatural = new Natural(nombre, direccion, doc, telefono, email, contrasenia, fechaNacimiento);
            this.listaClientes.add(clienteNatural);


        } else {

            if (nit == null && id_tributaria == null)
                throw new NullPointerException("El nit o el ID tributario es nulo");
            Juridica clienteJuridico = new Juridica(nombre, direccion, doc, telefono, email, contrasenia, nit, id_tributaria);
            this.listaClientes.add(clienteJuridico);
        }
    }


    private Cliente leerCliente(String email) {

        if (email != null) {
            for (Cliente c : listaClientes
            ) {
                if (c.getEmail().equals(email))
                    return c;
            }
        }
        return null;
    }

    private void actualizarCliente(String email, String nuevoNombre, String nuevaDirec, String nuevoDoc, String nuevoTelef, String nuevaContrasenia, String nuevoNIT, String nuevaID_tributaria) {

        if (email != null || !email.equals("")) {
            for (Cliente c : listaClientes
            ) {

                if (c.getEmail().equals(email)) {

                    if (c.getTipoPersona() == TipoPersona.NATURAL) {

                        if (nuevoNombre != null && !nuevoNombre.equals("")) {
                            c.setNombre(nuevoNombre);
                        }
                        if (nuevaDirec != null && !nuevaDirec.equals("")) {
                            c.setDireccion(nuevaDirec);
                        }
                        if (nuevoDoc != null && !nuevoDoc.equals("")) {
                            c.setDocumento(nuevoDoc);
                        }
                        if (nuevoTelef != null && !nuevoTelef.equals("")) {
                            c.setTelefono(nuevoTelef);
                        }

                        if (nuevaContrasenia != null && nuevaContrasenia.equals("")) {
                            c.setContrasenia(nuevaContrasenia);
                        }

                    }
                    if (c.getTipoPersona() == TipoPersona.JURIDICA) {

                        Juridica personaJuridica = (Juridica) c;

                        if (nuevoNIT != null && !nuevoNIT.equals("")) {
                            personaJuridica.setNit(nuevoNIT);
                        }
                        if (nuevaID_tributaria != null && !!nuevaID_tributaria.equals("")) {
                            personaJuridica.setId_tributaria(nuevaID_tributaria);
                        }
                    }

                }
            }
        }
    }

    private boolean eliminarCliente(String email) {

        if (email != null && !email.equals("")) {

            for (Cliente c : listaClientes
            ) {
                if (c.getEmail().equals(email)) {
                    listaClientes.remove(c);
                    return true;
                }
            }
        }
        return false;
    }


    // CRUD PRODUCTO


    public void crearProducto (String codigo, String nombre, int existencias, double valorUnitario, TipoProducto tipoProducto){


    }


}

