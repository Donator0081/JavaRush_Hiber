package dao;

import entities.Country;
import org.hibernate.SessionFactory;

public class CountryDAO extends GeneralDAO<Country>{
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
