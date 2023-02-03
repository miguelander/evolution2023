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
@Table(name = "compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compras.findAll", query = "SELECT c FROM Compras c")})
public class Compras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCompras")
    private Integer idCompras;
    @Size(max = 45)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 45)
    @Column(name = "Cantidad")
    private String cantidad;
    @Column(name = "valorProducto")
    private Long valorProducto;
    @Column(name = "valortotal")
    private Long valortotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "insumo_idInsumo")
    private int insumoidInsumo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Proveedor_idProveedor")
    private int proveedoridProveedor;

    public Compras() {
    }

    public Compras(Integer idCompras) {
        this.idCompras = idCompras;
    }

    public Compras(Integer idCompras, int insumoidInsumo, int proveedoridProveedor) {
        this.idCompras = idCompras;
        this.insumoidInsumo = insumoidInsumo;
        this.proveedoridProveedor = proveedoridProveedor;
    }

    public Integer getIdCompras() {
        return idCompras;
    }

    public void setIdCompras(Integer idCompras) {
        this.idCompras = idCompras;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Long getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(Long valorProducto) {
        this.valorProducto = valorProducto;
    }

    public Long getValortotal() {
        return valortotal;
    }

    public void setValortotal(Long valortotal) {
        this.valortotal = valortotal;
    }

    public int getInsumoidInsumo() {
        return insumoidInsumo;
    }

    public void setInsumoidInsumo(int insumoidInsumo) {
        this.insumoidInsumo = insumoidInsumo;
    }

    public int getProveedoridProveedor() {
        return proveedoridProveedor;
    }

    public void setProveedoridProveedor(int proveedoridProveedor) {
        this.proveedoridProveedor = proveedoridProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompras != null ? idCompras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compras)) {
            return false;
        }
        Compras other = (Compras) object;
        if ((this.idCompras == null && other.idCompras != null) || (this.idCompras != null && !this.idCompras.equals(other.idCompras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.prorevolution.Compras[ idCompras=" + idCompras + " ]";
    }
    
}
