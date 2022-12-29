
package com.portfolio.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    private String usuario;
    
    private String contraseña;

    public Admin() {
    }

    public Admin(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
}
