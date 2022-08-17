package model;

import model.enums.TipoPersona;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String direccion;
    private String documento;
    private TipoPersona tipoPersona;   //Puede ser NATURAL O JURIDICA.
    private String telefono;
    private String email;
    private String contrasenia;

    public Cliente(String nombre, String direccion, String documento, TipoPersona tipoPersona, String telefono, String email, String contrasenia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.documento = documento;
        this.tipoPersona = tipoPersona;
        this.telefono = telefono;
        this.email = email;
        this.contrasenia = contrasenia;

        if (this.tipoPersona == TipoPersona.JURIDICA.get)
    }

    public Cliente() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
