package dao;

import entities.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends GeneralDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
