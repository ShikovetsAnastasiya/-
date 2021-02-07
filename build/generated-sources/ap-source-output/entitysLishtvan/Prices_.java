package entitysLishtvan;

import entitysLishtvan.Flights;
import entitysLishtvan.Tickets;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-04T23:24:24")
@StaticMetamodel(Prices.class)
public class Prices_ { 

    public static volatile ListAttribute<Prices, Tickets> ticketsList;
    public static volatile SingularAttribute<Prices, BigInteger> ticketPrice;
    public static volatile SingularAttribute<Prices, Flights> flightCode;
    public static volatile SingularAttribute<Prices, BigDecimal> priceId;
    public static volatile SingularAttribute<Prices, String> travelClass;

}