package entitysLishtvan;

import entitysLishtvan.Flights;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-04T23:24:24")
@StaticMetamodel(Airlines.class)
public class Airlines_ { 

    public static volatile SingularAttribute<Airlines, String> airlinesIcaoCode;
    public static volatile SingularAttribute<Airlines, String> airlineCountry;
    public static volatile SingularAttribute<Airlines, String> airlineCallSign;
    public static volatile ListAttribute<Airlines, Flights> flightsList;
    public static volatile SingularAttribute<Airlines, String> airlineName;

}