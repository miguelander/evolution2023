/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.prorevolution.controllers;

import com.mycompany.prorevolution.Usuarios;
import com.mycompany.prorevolution.models.UsuariosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author kevin
 */
@Named(value = "userBean")
@SessionScoped
public class UserBean implements Serializable {
    
    @EJB
    private UsuariosFacade usuariosFacade;
    private Usuarios usuarios = new Usuarios ();

    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }
    
    public void save(){
      usuariosFacade.create(usuarios);
      usuarios = new Usuarios ();
    }

    /**
     * @return the usuarios
     */
    public Usuarios getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
}
