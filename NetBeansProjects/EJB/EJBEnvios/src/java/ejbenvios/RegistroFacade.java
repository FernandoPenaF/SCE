/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbenvios;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sdist
 */
@Stateless
public class RegistroFacade extends AbstractFacade<Registro> {

    @PersistenceContext(unitName = "EJBEnviosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroFacade() {
        super(Registro.class);
    }
    
}
