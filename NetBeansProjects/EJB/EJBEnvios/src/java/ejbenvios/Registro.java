/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbenvios;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sdist
 */
@Entity
@Table(name = "REGISTRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r")
    , @NamedQuery(name = "Registro.findByEntregaId", query = "SELECT r FROM Registro r WHERE r.entregaId = :entregaId")
    , @NamedQuery(name = "Registro.findByCustomerId", query = "SELECT r FROM Registro r WHERE r.customerId = :customerId")
    , @NamedQuery(name = "Registro.findByOrdenCompra", query = "SELECT r FROM Registro r WHERE r.ordenCompra = :ordenCompra")
    , @NamedQuery(name = "Registro.findByStatus", query = "SELECT r FROM Registro r WHERE r.status = :status")
    , @NamedQuery(name = "Registro.findByFechaPrometida", query = "SELECT r FROM Registro r WHERE r.fechaPrometida = :fechaPrometida")
    , @NamedQuery(name = "Registro.findByFechaEntregado", query = "SELECT r FROM Registro r WHERE r.fechaEntregado = :fechaEntregado")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENTREGA_ID")
    private Integer entregaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDEN_COMPRA")
    private int ordenCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "FECHA_PROMETIDA")
    @Temporal(TemporalType.DATE)
    private Date fechaPrometida;
    @Column(name = "FECHA_ENTREGADO")
    @Temporal(TemporalType.DATE)
    private Date fechaEntregado;

    public Registro() {
    }

    public Registro(Integer entregaId) {
        this.entregaId = entregaId;
    }

    public Registro(Integer entregaId, int customerId, int ordenCompra, Character status) {
        this.entregaId = entregaId;
        this.customerId = customerId;
        this.ordenCompra = ordenCompra;
        this.status = status;
    }

    public Integer getEntregaId() {
        return entregaId;
    }

    public void setEntregaId(Integer entregaId) {
        this.entregaId = entregaId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(int ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Date getFechaPrometida() {
        return fechaPrometida;
    }

    public void setFechaPrometida(Date fechaPrometida) {
        this.fechaPrometida = fechaPrometida;
    }

    public Date getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(Date fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entregaId != null ? entregaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.entregaId == null && other.entregaId != null) || (this.entregaId != null && !this.entregaId.equals(other.entregaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejbenvios.Registro[ entregaId=" + entregaId + " ]";
    }
    
}
