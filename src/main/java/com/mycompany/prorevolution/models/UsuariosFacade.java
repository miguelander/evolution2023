/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prorevolution.models;

import com.mycompany.prorevolution.Usuarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author kevin
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> {

    @PersistenceContext(unitName = "Prorevolution")
    private EntityManager em;
    private Query query;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }
    
    public List<Usuarios> login(String correo, String password){
        query = em.createQuery("SELECT u FROM Usuarios u WHERE u.usuEmail = :usuEmail AND u.password = :password ");
        query.setParameter("usuEmail", correo);
        query.setParameter("password", password);
        return query.getResultList();
                
    }
    
}
