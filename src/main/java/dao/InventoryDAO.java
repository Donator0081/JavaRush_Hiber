package dao;

import entities.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDAO extends GeneralDAO<Inventory>{
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
