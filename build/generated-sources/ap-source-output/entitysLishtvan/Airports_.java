package entitysLishtvan;

import entitysLishtvan.Flights;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-04T23:24:24")
@StaticMetamodel(Airports.class)
public class Airports_ { 

    public static volatile SingularAttribute<Airports, String> airportName;
    public static volatile SingularAttribute<Airports, String> airportLocation;
    public static volatile ListAttribute<Airports, Flights> flightsList1;
    public static volatile ListAttribute<Airports, Flights> flightsList;
    public static volatile SingularAttribute<Airports, String> airportCode;

}