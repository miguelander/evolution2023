/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prorevolution;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kevin
 */
@Entity
@Table(name = "inventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i")})
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinventario")
    private Integer idinventario;
    @Size(max = 45)
    @Column(name = "nombreinsumo")
    private String nombreinsumo;
    @Size(max = 40)
    @Column(name = "fechadeingreso")
    private String fechadeingreso;
    @Size(max = 40)
    @Column(name = "fechadevencimiento")
    private String fechadevencimiento;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "insumo_idInsumo")
    private int insumoidInsumo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "productos_idproductos")
    private int productosIdproductos;

    public Inventario() {
    }

    public Inventario(Integer idinventario) {
        this.idinventario = idinventario;
    }

    public Inventario(Integer idinventario, int insumoidInsumo, int productosIdproductos) {
        this.idinventario = idinventario;
        this.insumoidInsumo = insumoidInsumo;
        this.productosIdproductos = productosIdproductos;
    }

    public Integer getIdinventario() {
        return idinventario;
    }

    public void setIdinventario(Integer idinventario) {
        this.idinventario = idinventario;
    }

    public String getNombreinsumo() {
        return nombreinsumo;
    }

    public void setNombreinsumo(String nombreinsumo) {
        this.nombreinsumo = nombreinsumo;
    }

    public String getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(String fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }

    public String getFechadevencimiento() {
        return fechadevencimiento;
    }

    public void setFechadevencimiento(String fechadevencimiento) {
        this.fechadevencimiento = fechadevencimiento;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getInsumoidInsumo() {
        return insumoidInsumo;
    }

    public void setInsumoidInsumo(int insumoidInsumo) {
        this.insumoidInsumo = insumoidInsumo;
    }

    public int getProductosIdproductos() {
        return productosIdproductos;
    }

    public void setProductosIdproductos(int productosIdproductos) {
        this.productosIdproductos = productosIdproductos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinventario != null ? idinventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.idinventario == null && other.idinventario != null) || (this.idinventario != null && !this.idinventario.equals(other.idinventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.prorevolution.Inventario[ idinventario=" + idinventario + " ]";
    }
    
}
