/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.management.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "partes")
@NamedQueries({
    @NamedQuery(name = "Partes.findAll", query = "SELECT p FROM Partes p"),
    @NamedQuery(name = "Partes.findById", query = "SELECT p FROM Partes p WHERE p.id = :id"),
    @NamedQuery(name = "Partes.findByTipo", query = "SELECT p FROM Partes p WHERE p.tipo = :tipo")})
public class Partes implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "tipo")
    private String tipo;
    
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "modelo")
    //private List<Herramienta> herramientaList;

    public Partes() {
    }

    public Partes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //public List<Herramienta> getHerramientaList() {
    //    return herramientaList;
    //}

    //public void setHerramientaList(List<Herramienta> herramientaList) {
    //    this.herramientaList = herramientaList;
    //}

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partes)) {
            return false;
        }
        Partes other = (Partes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Partes[ id=" + id + " ]";
    }
    
}
