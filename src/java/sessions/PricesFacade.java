/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entitys.Flights;
import entitys.Prices;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author BSUIR
 */
@Stateless
public class PricesFacade extends AbstractFacade<Prices> {

    @PersistenceContext(unitName = "WebApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PricesFacade() {
        super(Prices.class);
    }
    
    public List<Prices> findFlightForUser(String airportTo, String airportFrom){ 
//        System.out.println(airportTo + " !222!222! " + airportFrom);
        List<Prices> prices  = em.createNamedQuery("Prices.findByTravelClass", Prices.class)
                .setParameter("travelClass", "BUSINESS").getResultList();
        List<Flights> flights = em.createNamedQuery("Flights.findCityFromTo", Flights.class)
                .setParameter("airportTo", airportTo).setParameter("airportFrom", airportFrom).getResultList();
        for (int i = 0; i < flights.size(); i++) {
            prices.addAll(flights.get(i).getPricesList());
        }
        return prices;
    }
    
}
