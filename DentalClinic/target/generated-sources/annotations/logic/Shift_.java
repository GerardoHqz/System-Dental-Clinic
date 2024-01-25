package logic;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Dentist;
import logic.Pacient;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-24T22:52:12")
@StaticMetamodel(Shift.class)
public class Shift_ { 

    public static volatile SingularAttribute<Shift, Pacient> pacient;
    public static volatile SingularAttribute<Shift, String> reason;
    public static volatile SingularAttribute<Shift, Integer> id_shift;
    public static volatile SingularAttribute<Shift, Date> shift_date;
    public static volatile SingularAttribute<Shift, String> shift_hour;
    public static volatile SingularAttribute<Shift, Dentist> dentist;

}