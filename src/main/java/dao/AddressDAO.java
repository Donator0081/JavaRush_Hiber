package dao;

import entities.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends GeneralDAO<Address>{
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
