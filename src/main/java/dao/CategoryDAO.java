package dao;

import entities.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GeneralDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
