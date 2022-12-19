package dao;

import entities.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends GeneralDAO<FilmText>{
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
