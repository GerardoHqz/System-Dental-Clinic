package logic;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Schedule;
import logic.Shift;
import logic.Users;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-30T01:40:15")
@StaticMetamodel(Dentist.class)
public class Dentist_ extends Person_ {

    public static volatile SingularAttribute<Dentist, String> speciality;
    public static volatile SingularAttribute<Dentist, Schedule> schedule;
    public static volatile ListAttribute<Dentist, Shift> shifts;
    public static volatile SingularAttribute<Dentist, Users> user;

}