package dao;

import entities.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GeneralDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
