package model.subclasses;

import model.Cliente;
import model.enums.TipoPersona;

import java.util.Date;

public class Natural extends Cliente {

    //Atributos
    private String email;
    private Date fechaNacimiento;


    public Natural(String email, Date fechaNacimiento) {
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Natural(String nombre, String direccion, String documento, String telefono, String email, String contrasenia, Date fechaNacimiento) {
        super(nombre, direccion, documento, TipoPersona.NATURAL, telefono, email, contrasenia);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
