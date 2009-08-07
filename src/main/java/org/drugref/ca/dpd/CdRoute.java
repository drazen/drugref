/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.drugref.ca.dpd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jackson
 */
@Entity
@Table(name = "cd_route")
@NamedQueries({@NamedQuery(name = "CdRoute.findAll", query = "SELECT c FROM CdRoute c"), @NamedQuery(name = "CdRoute.findByDrugCode", query = "SELECT c FROM CdRoute c WHERE c.drugCode = :drugCode"), @NamedQuery(name = "CdRoute.findByRouteOfAdministrationCode", query = "SELECT c FROM CdRoute c WHERE c.routeOfAdministrationCode = :routeOfAdministrationCode"), @NamedQuery(name = "CdRoute.findByRouteOfAdministration", query = "SELECT c FROM CdRoute c WHERE c.routeOfAdministration = :routeOfAdministration"), @NamedQuery(name = "CdRoute.findById", query = "SELECT c FROM CdRoute c WHERE c.id = :id")})
public class CdRoute implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "drug_code")
    private Integer drugCode;
    @Column(name = "route_of_administration_code")
    private Integer routeOfAdministrationCode;
    @Column(name = "route_of_administration")
    private String routeOfAdministration;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public CdRoute() {
    }

    public CdRoute(Integer id) {
        this.id = id;
    }

    public Integer getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(Integer drugCode) {
        this.drugCode = drugCode;
    }

    public Integer getRouteOfAdministrationCode() {
        return routeOfAdministrationCode;
    }

    public void setRouteOfAdministrationCode(Integer routeOfAdministrationCode) {
        this.routeOfAdministrationCode = routeOfAdministrationCode;
    }

    public String getRouteOfAdministration() {
        return routeOfAdministration;
    }

    public void setRouteOfAdministration(String routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CdRoute)) {
            return false;
        }
        CdRoute other = (CdRoute) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.drugref.ca.dpd.CdRoute[id=" + id + "]";
    }

}
