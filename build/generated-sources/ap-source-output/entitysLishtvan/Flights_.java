package entitysLishtvan;

import entitysLishtvan.Airlines;
import entitysLishtvan.Airports;
import entitysLishtvan.Pilots;
import entitysLishtvan.Prices;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-04T23:24:24")
@StaticMetamodel(Flights.class)
public class Flights_ { 

    public static volatile SingularAttribute<Flights, Date> tDate;
    public static volatile SingularAttribute<Flights, Pilots> copilotId;
    public static volatile SingularAttribute<Flights, BigInteger> numOfEconomy;
    public static volatile SingularAttribute<Flights, String> flightCode;
    public static volatile SingularAttribute<Flights, Airports> airportTo;
    public static volatile SingularAttribute<Flights, BigInteger> numOfFirst;
    public static volatile SingularAttribute<Flights, Date> fDate;
    public static volatile SingularAttribute<Flights, BigInteger> flightDistance;
    public static volatile SingularAttribute<Flights, Airports> airportFrom;
    public static volatile SingularAttribute<Flights, BigInteger> numOfBusiness;
    public static volatile ListAttribute<Flights, Prices> pricesList;
    public static volatile SingularAttribute<Flights, Airlines> airlineCode;
    public static volatile SingularAttribute<Flights, Pilots> pilotId;

}