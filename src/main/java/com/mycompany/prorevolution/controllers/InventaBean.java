/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.prorevolution.controllers;

import com.mycompany.prorevolution.Inventario;
import com.mycompany.prorevolution.models.InventarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author kevin
 */
@Named(value = "inventaBean")
@SessionScoped
public class InventaBean implements Serializable {
    
    @EJB
    private InventarioFacade inventarioFacade;
    private Inventario inventario = new Inventario ();

    /**
     * Creates a new instance of InventaBean
     */
    public InventaBean() {
    }
    
    public List<Inventario> findAll (){
        return inventarioFacade.findAll();
    }
    
    public void delete(Inventario inventario){
        inventarioFacade.remove(inventario);
        
    }
    
    public void update(Inventario inventario){
        this.inventario = inventario;
    }
    
    public void clear(){
        inventario = new Inventario();
    }
    
    public void save(){
      if(inventario.getIdinventario()!=null){
         inventarioFacade.edit(inventario);
      }else{
         inventarioFacade.create(inventario);
      }
        inventario = new Inventario();
    }

    /**
     * @return the inventario
     */
    public Inventario getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    
}


