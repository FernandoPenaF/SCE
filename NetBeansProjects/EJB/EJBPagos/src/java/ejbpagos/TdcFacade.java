/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbpagos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sdist
 */
@Stateless
public class TdcFacade extends AbstractFacade<Tdc> {

    @PersistenceContext(unitName = "EJBPagosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TdcFacade() {
        super(Tdc.class);
    }
    
}
