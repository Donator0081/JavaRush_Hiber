package dao;

import entities.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GeneralDAO<Customer>{
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
