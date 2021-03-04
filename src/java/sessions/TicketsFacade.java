/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entitys.Passengers;
import entitys.Tickets;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author BSUIR
 */
@Stateless
public class TicketsFacade extends AbstractFacade<Tickets> {

    @PersistenceContext(unitName = "WebApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TicketsFacade() {
        super(Tickets.class);
    }
    
    public List<Tickets> findPassengersTickets(BigDecimal passId){ 
        return em.createNamedQuery("Tickets.findByPassId", Tickets.class)
                .setParameter("passId", passId).getResultList();
    }
    
}
