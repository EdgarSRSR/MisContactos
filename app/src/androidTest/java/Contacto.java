package com.solrom.edgar.miscontactos;

/**
 * Created by edgarsr on 18/08/17.
 
 Contact object declaration
 */

public class Contacto {
    
    //name, telephone and email
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    // get name
    public String getNombre() {
        return nombre;
    }
    // set name
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //get telephone
    public String getTelefono() {
        return telefono;
    }
    // set telephone
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // get email
    public String getEmail() {
        return email;
    }
    // set email
    public void setEmail(String email) {
        this.email = email;
    }
}
