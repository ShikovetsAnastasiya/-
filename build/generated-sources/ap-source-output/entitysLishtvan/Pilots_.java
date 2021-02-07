package entitysLishtvan;

import entitysLishtvan.Flights;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-04T23:24:24")
@StaticMetamodel(Pilots.class)
public class Pilots_ { 

    public static volatile SingularAttribute<Pilots, String> surname;
    public static volatile ListAttribute<Pilots, Flights> flightsList1;
    public static volatile SingularAttribute<Pilots, String> name;
    public static volatile ListAttribute<Pilots, Flights> flightsList;
    public static volatile SingularAttribute<Pilots, BigDecimal> pilotId;

}