/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.drugref.ca.dpd;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jackson
 */
@Entity
@Table(name = "cd_drug_product", catalog = "drugref2", schema = "public")
@NamedQueries({@NamedQuery(name = "CdDrugProduct.findAll", query = "SELECT c FROM CdDrugProduct c"), @NamedQuery(name = "CdDrugProduct.findByDrugCode", query = "SELECT c FROM CdDrugProduct c WHERE c.drugCode = :drugCode"), @NamedQuery(name = "CdDrugProduct.findByProductCategorization", query = "SELECT c FROM CdDrugProduct c WHERE c.productCategorization = :productCategorization"), @NamedQuery(name = "CdDrugProduct.findByClass1", query = "SELECT c FROM CdDrugProduct c WHERE c.class1 = :class1"), @NamedQuery(name = "CdDrugProduct.findByDrugIdentificationNumber", query = "SELECT c FROM CdDrugProduct c WHERE c.drugIdentificationNumber = :drugIdentificationNumber"), @NamedQuery(name = "CdDrugProduct.findByBrandName", query = "SELECT c FROM CdDrugProduct c WHERE c.brandName = :brandName"), @NamedQuery(name = "CdDrugProduct.findByGpFlag", query = "SELECT c FROM CdDrugProduct c WHERE c.gpFlag = :gpFlag"), @NamedQuery(name = "CdDrugProduct.findByAccessionNumber", query = "SELECT c FROM CdDrugProduct c WHERE c.accessionNumber = :accessionNumber"), @NamedQuery(name = "CdDrugProduct.findByNumberOfAis", query = "SELECT c FROM CdDrugProduct c WHERE c.numberOfAis = :numberOfAis"), @NamedQuery(name = "CdDrugProduct.findByLastUpdateDate", query = "SELECT c FROM CdDrugProduct c WHERE c.lastUpdateDate = :lastUpdateDate"), @NamedQuery(name = "CdDrugProduct.findByAiGroupNo", query = "SELECT c FROM CdDrugProduct c WHERE c.aiGroupNo = :aiGroupNo"), @NamedQuery(name = "CdDrugProduct.findByCompanyCode", query = "SELECT c FROM CdDrugProduct c WHERE c.companyCode = :companyCode"), @NamedQuery(name = "CdDrugProduct.findById", query = "SELECT c FROM CdDrugProduct c WHERE c.id = :id")})
public class CdDrugProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "drug_code")
    private Integer drugCode;
    @Column(name = "product_categorization", length = 80)
    private String productCategorization;
    @Column(name = "class", length = 40)
    private String class1;
    @Column(name = "drug_identification_number", length = 8)
    private String drugIdentificationNumber;
    @Column(name = "brand_name", length = 200)
    private String brandName;
    @Column(name = "gp_flag")
    private Character gpFlag;
    @Column(name = "accession_number", length = 5)
    private String accessionNumber;
    @Column(name = "number_of_ais", length = 10)
    private String numberOfAis;
    @Column(name = "last_update_date")
    @Temporal(TemporalType.DATE)
    private Date lastUpdateDate;
    @Column(name = "ai_group_no", length = 10)
    private String aiGroupNo;
    @Column(name = "company_code")
    private Integer companyCode;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;

    public CdDrugProduct() {
    }

    public CdDrugProduct(Integer id) {
        this.id = id;
    }

    public Integer getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(Integer drugCode) {
        this.drugCode = drugCode;
    }

    public String getProductCategorization() {
        return productCategorization;
    }

    public void setProductCategorization(String productCategorization) {
        this.productCategorization = productCategorization;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getDrugIdentificationNumber() {
        return drugIdentificationNumber;
    }

    public void setDrugIdentificationNumber(String drugIdentificationNumber) {
        this.drugIdentificationNumber = drugIdentificationNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Character getGpFlag() {
        return gpFlag;
    }

    public void setGpFlag(Character gpFlag) {
        this.gpFlag = gpFlag;
    }

    public String getAccessionNumber() {
        return accessionNumber;
    }

    public void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public String getNumberOfAis() {
        return numberOfAis;
    }

    public void setNumberOfAis(String numberOfAis) {
        this.numberOfAis = numberOfAis;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getAiGroupNo() {
        return aiGroupNo;
    }

    public void setAiGroupNo(String aiGroupNo) {
        this.aiGroupNo = aiGroupNo;
    }

    public Integer getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Integer companyCode) {
        this.companyCode = companyCode;
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
        if (!(object instanceof CdDrugProduct)) {
            return false;
        }
        CdDrugProduct other = (CdDrugProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.drugref.ca.dpd.CdDrugProduct[id=" + id + "]";
    }

}
