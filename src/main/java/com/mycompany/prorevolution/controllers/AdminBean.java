/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.prorevolution.controllers;

import com.mycompany.prorevolution.Ventas;
import com.mycompany.prorevolution.models.VentasFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author kevin
 */
@Named(value = "adminBean")
@SessionScoped
public class AdminBean implements Serializable {
    
    @EJB
    private VentasFacade ventasFacade;
    private Ventas ventas = new Ventas();

    /**
     * Creates a new instance of AdminBean
     */
    public AdminBean() {
        
    }
    
    public List<Ventas> findAll(){
        return ventasFacade.findAll();
    }
    
    public void delete(Ventas ventas){
        ventasFacade.remove(ventas);
        
    }
    
    public void update(Ventas ventas){
        this.ventas = ventas;
    }
    
    public void clear(){
        ventas = new Ventas();
    }
    
    public void save(){
      if(ventas.getIdventas() !=null){
         ventasFacade.edit(ventas);
      }else{
         ventasFacade.create(ventas);
      }
        ventas = new Ventas();
    }

    /**
     * @return the ventas
     */
    public Ventas getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
    }
    
    
}
