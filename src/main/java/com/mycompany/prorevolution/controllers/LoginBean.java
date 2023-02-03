/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.prorevolution.controllers;

import com.mycompany.prorevolution.Usuarios;
import com.mycompany.prorevolution.models.UsuariosFacade;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author kevin
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {
    
    private String correo;
    private String password;
    @EJB
    private UsuariosFacade usuariosFacade;
    private String menssage;
  

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    public void login() throws IOException{
       List<Usuarios> usuarios = usuariosFacade.login(correo,password);
       if(usuarios.isEmpty() !=true){
           if(usuarios.get(0).getTiporol().equals("Administrador")){
               FacesContext.getCurrentInstance().getExternalContext().redirect("adm_inv.xhtml");
           } else if(usuarios.get(0).getTiporol().equals("Empleado")){
               FacesContext.getCurrentInstance().getExternalContext().redirect("adm_ven.xhtml");
           }
       } else {
           menssage = "Los datos ingresados son incorrectos!";
       }     
    }
    
    
    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the menssage
     */
    public String getMenssage() {
        return menssage;
    }

    /**
     * @param menssage the menssage to set
     */
    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }
    
    
    
}
