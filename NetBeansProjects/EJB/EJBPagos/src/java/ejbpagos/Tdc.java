/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbpagos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sdist
 */
@Entity
@Table(name = "TDC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tdc.findAll", query = "SELECT t FROM Tdc t")
    , @NamedQuery(name = "Tdc.findByTdcId", query = "SELECT t FROM Tdc t WHERE t.tdcId = :tdcId")
    , @NamedQuery(name = "Tdc.findByCustomerId", query = "SELECT t FROM Tdc t WHERE t.customerId = :customerId")
    , @NamedQuery(name = "Tdc.findByLdc", query = "SELECT t FROM Tdc t WHERE t.ldc = :ldc")})
public class Tdc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TDC_ID")
    private Integer tdcId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "LDC")
    private BigDecimal ldc;

    public Tdc() {
    }

    public Tdc(Integer tdcId) {
        this.tdcId = tdcId;
    }

    public Tdc(Integer tdcId, int customerId, BigDecimal ldc) {
        this.tdcId = tdcId;
        this.customerId = customerId;
        this.ldc = ldc;
    }

    public Integer getTdcId() {
        return tdcId;
    }

    public void setTdcId(Integer tdcId) {
        this.tdcId = tdcId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getLdc() {
        return ldc;
    }

    public void setLdc(BigDecimal ldc) {
        this.ldc = ldc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tdcId != null ? tdcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tdc)) {
            return false;
        }
        Tdc other = (Tdc) object;
        if ((this.tdcId == null && other.tdcId != null) || (this.tdcId != null && !this.tdcId.equals(other.tdcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejbpagos.Tdc[ tdcId=" + tdcId + " ]";
    }
    
}
