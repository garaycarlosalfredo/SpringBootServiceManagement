/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.management.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "herramienta")
@NamedQueries({
    @NamedQuery(name = "Herramienta.findAll", query = "SELECT h FROM Herramienta h"),
    @NamedQuery(name = "Herramienta.findById", query = "SELECT h FROM Herramienta h WHERE h.id = :id"),
    @NamedQuery(name = "Herramienta.findByCiclos", query = "SELECT h FROM Herramienta h WHERE h.ciclos = :ciclos"),
    @NamedQuery(name = "Herramienta.findByCiclosReengrase", query = "SELECT h FROM Herramienta h WHERE h.ciclosReengrase = :ciclosReengrase")})
public class Herramienta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ciclos")
    private Integer ciclos;
    @Column(name = "ciclosReengrase")
    private Integer ciclosReengrase;
    @JoinColumn(name = "modelo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Partes modelo;
    //@OneToMany(mappedBy = "numeroSerie")
    //private List<Ingreso> ingresoList;

    public Herramienta() {
    }

    public Herramienta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCiclos() {
        return ciclos;
    }

    public void setCiclos(Integer ciclos) {
        this.ciclos = ciclos;
    }

    public Integer getCiclosReengrase() {
        return ciclosReengrase;
    }

    public void setCiclosReengrase(Integer ciclosReengrase) {
        this.ciclosReengrase = ciclosReengrase;
    }

    public Partes getModelo() {
        return modelo;
    }

    public void setModelo(Partes modelo) {
        this.modelo = modelo;
    }
/*
    public List<Ingreso> getIngresoList() {
        return ingresoList;
    }

    public void setIngresoList(List<Ingreso> ingresoList) {
        this.ingresoList = ingresoList;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Herramienta)) {
            return false;
        }
        Herramienta other = (Herramienta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Herramienta[ id=" + id + " ]";
    }
    
}
