package entitysLishtvan;

import entitysLishtvan.Tickets;
import entitysLishtvan.Users;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-04T23:24:24")
@StaticMetamodel(Passengers.class)
public class Passengers_ { 

    public static volatile ListAttribute<Passengers, Tickets> ticketsList;
    public static volatile SingularAttribute<Passengers, String> firstName;
    public static volatile SingularAttribute<Passengers, String> lastName;
    public static volatile SingularAttribute<Passengers, String> country;
    public static volatile SingularAttribute<Passengers, String> passportNum;
    public static volatile SingularAttribute<Passengers, BigDecimal> passId;
    public static volatile SingularAttribute<Passengers, Users> username;

}