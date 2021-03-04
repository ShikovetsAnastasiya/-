/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entitys.Passengers;
import entitys.Users;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author BSUIR
 */
@Stateless
public class PassengersFacade extends AbstractFacade<Passengers> {
    @EJB
    private sessions.UsersFacade ejbFacade; 
    
    @PersistenceContext(unitName = "WebApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PassengersFacade() {
        super(Passengers.class);
    }
    
    public BigDecimal findNextID(){ 
        return em.createNamedQuery("Passengers.findLastPassId", Passengers.class)
                .getResultList().get(0).getPassId().add(BigDecimal.ONE);
    }

    public Passengers getPassengerByUser(Users username){ 
        return em.createNamedQuery("Passengers.findByUsername", Passengers.class)
                .setParameter("username", username).getResultList().get(0);
    }
    
}

