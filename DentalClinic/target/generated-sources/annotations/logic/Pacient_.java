package logic;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Responsible;
import logic.Shift;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-30T01:40:15")
@StaticMetamodel(Pacient.class)
public class Pacient_ extends Person_ {

    public static volatile SingularAttribute<Pacient, String> blood_type;
    public static volatile SingularAttribute<Pacient, Responsible> responsible;
    public static volatile ListAttribute<Pacient, Shift> shifts;
    public static volatile SingularAttribute<Pacient, Boolean> social_security;

}