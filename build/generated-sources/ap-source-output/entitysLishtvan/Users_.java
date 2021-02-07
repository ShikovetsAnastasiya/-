package entitysLishtvan;

import entitysLishtvan.Passengers;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-04T23:24:24")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, BigInteger> userRole;
    public static volatile SingularAttribute<Users, String> username;
    public static volatile ListAttribute<Users, Passengers> passengersList;

}