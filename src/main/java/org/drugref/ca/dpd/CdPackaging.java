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
@Table(name = "cd_packaging", catalog = "drugref2", schema = "public")
@NamedQueries({@NamedQuery(name = "CdPackaging.findAll", query = "SELECT c FROM CdPackaging c"), @NamedQuery(name = "CdPackaging.findByDrugCode", query = "SELECT c FROM CdPackaging c WHERE c.drugCode = :drugCode"), @NamedQuery(name = "CdPackaging.findByUpc", query = "SELECT c FROM CdPackaging c WHERE c.upc = :upc"), @NamedQuery(name = "CdPackaging.findByPackageSizeUnit", query = "SELECT c FROM CdPackaging c WHERE c.packageSizeUnit = :packageSizeUnit"), @NamedQuery(name = "CdPackaging.findByPackageType", query = "SELECT c FROM CdPackaging c WHERE c.packageType = :packageType"), @NamedQuery(name = "CdPackaging.findByPackageSize", query = "SELECT c FROM CdPackaging c WHERE c.packageSize = :packageSize"), @NamedQuery(name = "CdPackaging.findByProductInforation", query = "SELECT c FROM CdPackaging c WHERE c.productInforation = :productInforation"), @NamedQuery(name = "CdPackaging.findById", query = "SELECT c FROM CdPackaging c WHERE c.id = :id")})
public class CdPackaging implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "drug_code")
    private Integer drugCode;
    @Column(name = "upc", length = 12)
    private String upc;
    @Column(name = "package_size_unit", length = 40)
    private String packageSizeUnit;
    @Column(name = "package_type", length = 40)
    private String packageType;
    @Column(name = "package_size", length = 5)
    private String packageSize;
    @Column(name = "product_inforation", length = 80)
    private String productInforation;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;

    public CdPackaging() {
    }

    public CdPackaging(Integer id) {
        this.id = id;
    }

    public Integer getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(Integer drugCode) {
        this.drugCode = drugCode;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getPackageSizeUnit() {
        return packageSizeUnit;
    }

    public void setPackageSizeUnit(String packageSizeUnit) {
        this.packageSizeUnit = packageSizeUnit;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(String packageSize) {
        this.packageSize = packageSize;
    }

    public String getProductInforation() {
        return productInforation;
    }

    public void setProductInforation(String productInforation) {
        this.productInforation = productInforation;
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
        if (!(object instanceof CdPackaging)) {
            return false;
        }
        CdPackaging other = (CdPackaging) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.drugref.ca.dpd.CdPackaging[id=" + id + "]";
    }

}
