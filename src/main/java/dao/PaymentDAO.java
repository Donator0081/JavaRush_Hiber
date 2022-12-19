package dao;

import entities.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GeneralDAO<Payment>{
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
