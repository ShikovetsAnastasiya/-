package entitysLishtvan;

import entitysLishtvan.Passengers;
import entitysLishtvan.Prices;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-04T23:24:24")
@StaticMetamodel(Tickets.class)
public class Tickets_ { 

    public static volatile SingularAttribute<Tickets, String> ticketStatus;
    public static volatile SingularAttribute<Tickets, Passengers> passId;
    public static volatile SingularAttribute<Tickets, Prices> priceId;
    public static volatile SingularAttribute<Tickets, String> ticketCode;

}